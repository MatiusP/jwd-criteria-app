package by.tc.task01.entity;

public class Laptop implements Appliance {
    private double batteryCapacity;
    private String operationSystem;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    private Laptop(Builder builder) {
        this.batteryCapacity = builder.batteryCapacity;
        this.operationSystem = builder.operationSystem;
        this.memoryRom = builder.memoryRom;
        this.systemMemory = builder.systemMemory;
        this.cpu = builder.cpu;
        this.displayInches = builder.displayInches;
    }


    public static class Builder {
        private double batteryCapacity;
        private String operationSystem;
        private double memoryRom;
        private double systemMemory;
        private double cpu;
        private double displayInches;

        public Builder setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setOperationSystem(String operationSystem) {
            this.operationSystem = operationSystem;
            return this;
        }

        public Builder setMemoryRom(double memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public Builder setSystemMemory(double systemMemory) {
            this.systemMemory = systemMemory;
            return this;
        }

        public Builder setCpu(double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setDisplayInches(double displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        public Laptop buildLaptop() {
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "Laptop: " +
                "batteryCapacity=" + batteryCapacity +
                ", operationSystem=" + operationSystem +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                ';';
    }
}
