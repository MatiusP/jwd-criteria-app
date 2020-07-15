package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.Map;

public class OvenCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        Oven oven = new Oven();

        oven.setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")));
        oven.setWeight(Double.parseDouble(applianceCriteria.get("WEIGHT")));
        oven.setCapacity(Double.parseDouble(applianceCriteria.get("CAPACITY")));
        oven.setDepth(Double.parseDouble(applianceCriteria.get("DEPTH")));
        oven.setHeight(Double.parseDouble(applianceCriteria.get("HEIGHT")));
        oven.setWidth(Double.parseDouble(applianceCriteria.get("WIDTH")));

        return oven;
    }
}
