package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

public class VacuumCleanerCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {

        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        vacuumCleaner.setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")));
        vacuumCleaner.setFilterType(applianceCriteria.get("FILTER_TYPE"));
        vacuumCleaner.setBagType(applianceCriteria.get("BAG_TYPE"));
        vacuumCleaner.setWandType(applianceCriteria.get("WAND_TYPE"));
        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(applianceCriteria.get("MOTOR_SPEED_REGULATION")));
        vacuumCleaner.setCleaningWidth(Double.parseDouble(applianceCriteria.get("CLEANING_WIDTH")));

        return vacuumCleaner;
    }
}
