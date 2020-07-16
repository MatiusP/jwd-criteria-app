package by.tc.task01.entity;

public class Refrigerator implements Appliance {
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    private Refrigerator(Builder builder) {
        this.powerConsumption = builder.powerConsumption;
        this.weight = builder.weight;
        this.freezerCapacity = builder.freezerCapacity;
        this.overallCapacity = builder.overallCapacity;
        this.height = builder.height;
        this.width = builder.width;
    }

    public static class Builder {
        private double powerConsumption;
        private double weight;
        private double freezerCapacity;
        private double overallCapacity;
        private double height;
        private double width;

        public Builder setPowerConsumption(double powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setFreezerCapacity(double freezerCapacity) {
            this.freezerCapacity = freezerCapacity;
            return this;
        }

        public Builder setOverallCapacity(double overallCapacity) {
            this.overallCapacity = overallCapacity;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(double width) {
            this.width = width;
            return this;
        }

        public Refrigerator buildRefrigerator() {
            return new Refrigerator(this);
        }
    }

    @Override
    public String toString() {
        return "Refrigerator: " +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                ';';
    }
}
