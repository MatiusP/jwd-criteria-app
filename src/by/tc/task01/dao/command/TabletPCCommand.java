package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.Map;

public class TabletPCCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        TabletPC tabletPC = new TabletPC();

        tabletPC.setBatteryCapacity(Double.parseDouble(applianceCriteria.get("BATTERY_CAPACITY")));
        tabletPC.setDisplayInches(Double.parseDouble(applianceCriteria.get("DISPLAY_INCHES")));
        tabletPC.setMemoryRom(Double.parseDouble(applianceCriteria.get("MEMORY_ROM")));
        tabletPC.setFlashMemoryCapacity(Double.parseDouble(applianceCriteria.get("FLASH_MEMORY_CAPACITY")));
        tabletPC.setColor(applianceCriteria.get("COLOR"));

        return tabletPC;
    }
}
