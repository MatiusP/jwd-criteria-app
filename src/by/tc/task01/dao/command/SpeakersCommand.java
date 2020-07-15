package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

public class SpeakersCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) {
        Speakers speakers = new Speakers();

        speakers.setPowerConsumption(Double.parseDouble(applianceCriteria.get("POWER_CONSUMPTION")));
        speakers.setNumberOfSpeakers(Double.parseDouble(applianceCriteria.get("NUMBER_OF_SPEAKERS")));
        speakers.setFrequencyRange(applianceCriteria.get("FREQUENCY_RANGE"));
        speakers.setCordLength(Double.parseDouble(applianceCriteria.get("CORD_LENGTH")));

        return speakers;
    }
}
