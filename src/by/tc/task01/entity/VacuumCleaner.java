package by.tc.task01.entity;

public class VacuumCleaner implements Appliance {
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    private VacuumCleaner(Builder builder) {
        this.powerConsumption = builder.powerConsumption;
        this.filterType = builder.filterType;
        this.bagType = builder.bagType;
        this.wandType = builder.wandType;
        this.motorSpeedRegulation = builder.motorSpeedRegulation;
        this.cleaningWidth = builder.cleaningWidth;
    }

    public static class Builder {
        private double powerConsumption;
        private String filterType;
        private String bagType;
        private String wandType;
        private double motorSpeedRegulation;
        private double cleaningWidth;

        public Builder setPowerConsumption(double powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setBagType(String bagType) {
            this.bagType = bagType;
            return this;
        }

        public Builder setWandType(String wandType) {
            this.wandType = wandType;
            return this;
        }

        public Builder setMotorSpeedRegulation(double motorSpeedRegulation) {
            this.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public Builder setCleaningWidth(double cleaningWidth) {
            this.cleaningWidth = cleaningWidth;
            return this;
        }

        public VacuumCleaner buildVacuumCleaner() {
            return new VacuumCleaner(this);
        }
    }

    @Override
    public String toString() {
        return "VacuumCleaner: " +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType=" + bagType +
                ", wandType=" + wandType +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                ';';
    }
}
