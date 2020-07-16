package by.tc.task01.entity;

public class Oven implements Appliance {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    private Oven(Builder builder) {
        this.powerConsumption = builder.powerConsumption;
        this.weight = builder.weight;
        this.capacity = builder.capacity;
        this.depth = builder.depth;
        this.height = builder.height;
        this.width = builder.width;
    }


    public static class Builder {
        private double powerConsumption;
        private double weight;
        private double capacity;
        private double depth;
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

        public Builder setCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setDepth(double depth) {
            this.depth = depth;
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

        public Oven buildOven() {
            return new Oven(this);
        }
    }

    @Override
    public String toString() {
        return "Oven: " +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ';';
    }


}
