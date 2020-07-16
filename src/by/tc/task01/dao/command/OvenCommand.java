package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.Map;

public class OvenCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        return new Oven.Builder()
                .setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")))
                .setWeight(Double.parseDouble(applianceCriteria.get("WEIGHT")))
                .setCapacity(Double.parseDouble(applianceCriteria.get("CAPACITY")))
                .setDepth(Double.parseDouble(applianceCriteria.get("DEPTH")))
                .setHeight(Double.parseDouble(applianceCriteria.get("HEIGHT")))
                .setWidth(Double.parseDouble(applianceCriteria.get("WIDTH")))
                .buildOven();
    }
}
