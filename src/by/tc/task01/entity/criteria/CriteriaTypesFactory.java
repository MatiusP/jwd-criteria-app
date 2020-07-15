package by.tc.task01.entity.criteria;

public class CriteriaTypesFactory {
    private static Object[] searchCriteria;

    public Object[] getSearchCriteria(String applianceType) {

        switch (applianceType) {
            case "Laptop":
                searchCriteria = SearchCriteria.Laptop.values();
                break;
            case "Oven":
                searchCriteria = SearchCriteria.Oven.values();
                break;
            case "Refrigerator":
                searchCriteria = SearchCriteria.Refrigerator.values();
                break;
            case "Speakers":
                searchCriteria = SearchCriteria.Speakers.values();
                break;
            case "TabletPC":
                searchCriteria = SearchCriteria.TabletPC.values();
                break;
            case "VacuumCleaner":
                searchCriteria = SearchCriteria.VacuumCleaner.values();
        }
        return searchCriteria;
    }
}

