package by.tc.task01.entity;

public class TabletPC implements Appliance {
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    private TabletPC(Builder builder) {
        this.batteryCapacity = builder.batteryCapacity;
        this.displayInches = builder.displayInches;
        this.memoryRom = builder.memoryRom;
        this.flashMemoryCapacity = builder.flashMemoryCapacity;
        this.color = builder.color;
    }

    public static class Builder {
        private double batteryCapacity;
        private double displayInches;
        private double memoryRom;
        private double flashMemoryCapacity;
        private String color;

        public Builder setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setDisplayInches(double displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        public Builder setMemoryRom(double memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public Builder setFlashMemoryCapacity(double flashMemoryCapacity) {
            this.flashMemoryCapacity = flashMemoryCapacity;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public TabletPC buildTabletPC() {
            return new TabletPC(this);
        }
    }

    @Override
    public String toString() {
        return "TabletPC: " +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                ';';
    }
}
