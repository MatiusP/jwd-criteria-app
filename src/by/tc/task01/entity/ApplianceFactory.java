package by.tc.task01.entity;

public class ApplianceFactory {
    private static Appliance appliance;

    public static Appliance getAppliance(String applianceName) {
        ApplianceType applianceType = ApplianceType.valueOf(applianceName);

        switch (applianceType) {
            case OVEN:
                appliance = new Oven();
                break;
            case LAPTOP:
                appliance = new Laptop();
                break;
            case SPEAKERS:
                appliance = new Speakers();
                break;
            case TABLET_PC:
                appliance = new TabletPC();
                break;
            case REFRIGERATOR:
                appliance = new Refrigerator();
                break;
            case VACUUM_CLEANER:
                appliance = new VacuumCleaner();
                break;
        }
        return appliance;
    }
}
