package by.tc.task01.service.validation;

import by.tc.task01.entity.ApplianceType;
import by.tc.task01.entity.criteria.Criteria;

public class Validator {
    private static final ApplianceType[] applianceTypes = ApplianceType.values();

    private static boolean applianceTypeValidator(Criteria criteria) {
        String applianceType = criteria.getGroupSearchName();

        if (!applianceType.isEmpty()) {
            for (ApplianceType type : applianceTypes) {
                if (type.toString().replace("_", "").equalsIgnoreCase(applianceType)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean criteriaValidator(Criteria criteria) {
        return applianceTypeValidator(criteria);
    }
}
