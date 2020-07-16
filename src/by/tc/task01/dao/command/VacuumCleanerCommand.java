package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

public class VacuumCleanerCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        return new VacuumCleaner.Builder()
                .setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")))
                .setFilterType(applianceCriteria.get("FILTER_TYPE"))
                .setBagType(applianceCriteria.get("BAG_TYPE"))
                .setWandType(applianceCriteria.get("WAND_TYPE"))
                .setMotorSpeedRegulation(Double.parseDouble(applianceCriteria.get("MOTOR_SPEED_REGULATION")))
                .setCleaningWidth(Double.parseDouble(applianceCriteria.get("CLEANING_WIDTH")))
                .buildVacuumCleaner();
    }
}
