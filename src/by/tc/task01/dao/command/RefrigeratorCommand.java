package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.Map;

public class RefrigeratorCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        return new Refrigerator.Builder()
                .setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")))
                .setWidth(Double.parseDouble(applianceCriteria.get("WEIGHT")))
                .setFreezerCapacity(Double.parseDouble(applianceCriteria.get("FREEZER_CAPACITY")))
                .setOverallCapacity(Double.parseDouble(applianceCriteria.get("OVERALL_CAPACITY")))
                .setHeight(Double.parseDouble(applianceCriteria.get("HEIGHT")))
                .setWeight(Double.parseDouble(applianceCriteria.get("WIDTH")))
                .buildRefrigerator();
    }
}
