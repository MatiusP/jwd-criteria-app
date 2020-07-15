package by.tc.task01.dao.impl;

import by.tc.task01.dao.exception.DaoException;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataSource {
    private static final String FILE_NAME = "./resources/appliances_db.txt";
    private static List<String> applianceByType = new ArrayList<>();


    public static List<String> getApplianceByType(Criteria criteria) throws DaoException {
        String applianceType = criteria.getGroupSearchName();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.toUpperCase().startsWith(applianceType.toUpperCase())) {
                    applianceByType.add(currentLine);
                }
            }
        } catch (IOException exception) {
            throw new DaoException(exception);
        }
        return applianceByType;
    }
}
