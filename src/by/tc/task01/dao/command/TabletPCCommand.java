package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.Map;

public class TabletPCCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        return new TabletPC.Builder()
                .setBatteryCapacity(Double.parseDouble(applianceCriteria.get("BATTERY_CAPACITY")))
                .setDisplayInches(Double.parseDouble(applianceCriteria.get("DISPLAY_INCHES")))
                .setMemoryRom(Double.parseDouble(applianceCriteria.get("MEMORY_ROM")))
                .setFlashMemoryCapacity(Double.parseDouble(applianceCriteria.get("FLASH_MEMORY_CAPACITY")))
                .setColor(applianceCriteria.get("COLOR"))
                .buildTabletPC();
    }
}
