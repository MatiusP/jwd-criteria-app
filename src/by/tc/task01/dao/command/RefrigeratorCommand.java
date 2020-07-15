package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.Map;

public class RefrigeratorCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        Refrigerator refrigerator = new Refrigerator();

        refrigerator.setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")));
        refrigerator.setWeight(Double.parseDouble(applianceCriteria.get("WEIGHT")));
        refrigerator.setFreezerCapacity(Double.parseDouble(applianceCriteria.get("FREEZER_CAPACITY")));
        refrigerator.setOverallCapacity(Double.parseDouble(applianceCriteria.get("OVERALL_CAPACITY")));
        refrigerator.setHeight(Double.parseDouble(applianceCriteria.get("HEIGHT")));
        refrigerator.setWeight(Double.parseDouble(applianceCriteria.get("WIDTH")));

        return refrigerator;
    }
}
