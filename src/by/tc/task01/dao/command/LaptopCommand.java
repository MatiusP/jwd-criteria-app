package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.Map;

public class LaptopCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {

        return new Laptop.Builder().
                setBatteryCapacity(Double.parseDouble(applianceCriteria.get("BATTERY_CAPACITY")))
                .setOperationSystem(applianceCriteria.get("OS"))
                .setMemoryRom(Double.parseDouble(applianceCriteria.get("MEMORY_ROM")))
                .setSystemMemory(Double.parseDouble(applianceCriteria.get("SYSTEM_MEMORY")))
                .setCpu(Double.parseDouble(applianceCriteria.get("CPU")))
                .setDisplayInches(Double.parseDouble(applianceCriteria.get("DISPLAY_INCHES")))
                .buildLaptop();
    }
}
