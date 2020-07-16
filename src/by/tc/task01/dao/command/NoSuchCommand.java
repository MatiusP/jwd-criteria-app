package by.tc.task01.dao.command;

import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.Appliance;

import java.util.Map;

public class NoSuchCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> applianceCriteria) throws DaoException {
        try {
            throw new Exception();
        } catch (Exception ex) {
            throw new DaoException(ex);
        }
    }
}
