package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

public class SpeakersCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        return new Speakers.Builder()
                .setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")))
                .setNumberOfSpeakers(Double.parseDouble(applianceCriteria.get("NUMBER_OF_SPEAKERS")))
                .setFrequencyRange(applianceCriteria.get("FREQUENCY_RANGE"))
                .setCordLength(Double.parseDouble(applianceCriteria.get("CORD_LENGTH")))
                .buildSpeakers();
    }
}
