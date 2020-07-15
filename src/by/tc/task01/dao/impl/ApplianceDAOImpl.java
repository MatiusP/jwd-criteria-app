package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.command.Command;
import by.tc.task01.dao.command.CommandProvider;
import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

    private List<Appliance> appliances;

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        CommandProvider commandProvider = new CommandProvider();
        Command currentCommand = commandProvider.takeCommand(criteria);

        List<String> applianceList = getApplianceByCriteria(criteria);
        Map<String, String> mapCharacteristics = new HashMap<>();

        if (!applianceList.isEmpty()) {
            appliances = new ArrayList<>();

            for (String appliance : applianceList) {
                String applianceCharacteristics = appliance.substring(appliance.indexOf(":") + 1).trim();

                String[] characteristics = applianceCharacteristics.split(",");
                for (String characteristic : characteristics) {
                    String tempCharacteristic = characteristic.replaceAll("[\\s]+", "");
                    String[] splitCharacteristicByNameAndValue = tempCharacteristic.split("=");
                    mapCharacteristics.put(splitCharacteristicByNameAndValue[0], splitCharacteristicByNameAndValue[1]);
                }
                appliances.add(currentCommand.execute(mapCharacteristics));
            }
        }
        return appliances;
    }


    private static List<String> getApplianceByCriteria(Criteria criteria) throws DaoException {
        List<String> applianceByCriteria = new ArrayList<>();

        List<String> applianceByType = ReadDataSource.getApplianceByType(criteria);
        Map<String, Object> criteriaValue = criteria.getCriteria();
        boolean flag;

        for (String appliance : applianceByType) {
            flag = true;
            for (Map.Entry<String, Object> entry : criteriaValue.entrySet()) {
                String entryToString = entry.getKey() + "=" + entry.getValue() + ",";
                if (!appliance.contains(entryToString)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                applianceByCriteria.add(appliance.replace(";", ""));
            }
        }
        return applianceByCriteria;
    }
}
