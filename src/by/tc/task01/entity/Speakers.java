package by.tc.task01.entity;

public class Speakers implements Appliance {
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    private Speakers(Builder builder) {
        this.powerConsumption = builder.powerConsumption;
        this.numberOfSpeakers = builder.numberOfSpeakers;
        this.frequencyRange = builder.frequencyRange;
        this.cordLength = builder.cordLength;
    }

    public static class Builder {
        private double powerConsumption;
        private double numberOfSpeakers;
        private String frequencyRange;
        private double cordLength;

        public Builder setPowerConsumption(double powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setNumberOfSpeakers(double numberOfSpeakers) {
            this.numberOfSpeakers = numberOfSpeakers;
            return this;
        }

        public Builder setFrequencyRange(String frequencyRange) {
            this.frequencyRange = frequencyRange;
            return this;
        }

        public Builder setCordLength(double cordLength) {
            this.cordLength = cordLength;
            return this;
        }

        public Speakers buildSpeakers() {
            return new Speakers(this);
        }
    }

    @Override
    public String toString() {
        return "Speakers: " +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                ';';
    }
}
