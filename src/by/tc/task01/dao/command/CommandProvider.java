package by.tc.task01.dao.command;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<CommandTypes, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandTypes.LAPTOP, new LaptopCommand());
        commands.put(CommandTypes.OVEN, new OvenCommand());
        commands.put(CommandTypes.REFRIGERATOR, new RefrigeratorCommand());
        commands.put(CommandTypes.SPEAKERS, new SpeakersCommand());
        commands.put(CommandTypes.TABLETPC, new TabletPCCommand());
        commands.put(CommandTypes.VACUUMCLEANER, new VacuumCleanerCommand());
        commands.put(CommandTypes.NO_SUCH_ELEMENT, new NoSuchCommand());
    }

    public Command takeCommand(Criteria criteria) {
        CommandTypes commandType;
        Command commandValue;

        try {
            commandType = CommandTypes.valueOf(criteria.getGroupSearchName().toUpperCase());
            commandValue = commands.get(commandType);
        } catch (Exception exception) {
            commandValue = commands.get(CommandTypes.NO_SUCH_ELEMENT);
        }
        return commandValue;
    }
}
