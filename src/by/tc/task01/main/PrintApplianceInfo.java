package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
        if (appliance != null) {
            if (appliance.size() == 0) {
                System.out.println("No matches found");
            }
            for (Appliance element : appliance) {
                System.out.println(element);
            }
        }
    }
}
