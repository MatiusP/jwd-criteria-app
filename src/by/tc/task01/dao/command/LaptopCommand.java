package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.Map;

public class LaptopCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {

        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble(applianceCriteria.get("BATTERY_CAPACITY")));
        laptop.setOperationSystem(applianceCriteria.get("OS"));
        laptop.setMemoryRom(Double.parseDouble(applianceCriteria.get("MEMORY_ROM")));
        laptop.setSystemMemory(Double.parseDouble(applianceCriteria.get("SYSTEM_MEMORY")));
        laptop.setCpu(Double.parseDouble(applianceCriteria.get("CPU")));
        laptop.setDisplayInches(Double.parseDouble(applianceCriteria.get("DISPLAY_INCHES")));

        return laptop;
    }
}
