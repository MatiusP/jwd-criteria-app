package by.tc.task01.dao.command;

import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.Appliance;

import java.util.Map;

public interface Command {

    public Appliance execute(Map<String, String> applianceCriteria) throws DaoException;
}
