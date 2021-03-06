package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.criteriaValidator(criteria)) {
            throw new ServiceException("Incorrect appliance type");
        }

        DAOFactory factory;
        ApplianceDAO applianceDAO;
        List<Appliance> appliance;

        try {
            factory = DAOFactory.getInstance();
            applianceDAO = factory.getApplianceDAO();
            appliance = applianceDAO.find(criteria);
        } catch (DaoException exception) {
            throw new ServiceException(exception);
        }
        return appliance;
    }
}
