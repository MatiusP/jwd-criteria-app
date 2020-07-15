package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.exception.ServiceException;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1000);
//        criteriaOven.add(Oven.CAPACITY.toString(), 3);
//        criteriaOven.add(Oven.CAPACITY.toString(), 3);

        try {
            appliance = service.find(criteriaOven);
            PrintApplianceInfo.print(appliance);
        } catch (ServiceException e) {
            //log
            System.out.println("Something is wrong");
        }

        //////////////////////////////////////////////////////////////////

        Criteria criteria = new Criteria("VacuumCleaner");
        criteria.add("POWER_CONSUMPTION", 100);
        criteria.add("FILTER_TYPE", "A");

        try {
            appliance = service.find(criteria);
            PrintApplianceInfo.print(appliance);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

//        criteriaOven = new Criteria(Oven.class.getSimpleName());
//        criteriaOven.add(Oven.HEIGHT.toString(), 200);
//        criteriaOven.add(Oven.DEPTH.toString(), 300);
//
//        try {
//            appliance = service.find(criteriaOven);
//            PrintApplianceInfo.print(appliance);
//        } catch (ServiceException e) {
//            //log
//            System.out.println("Something is wrong");
//        }


        //////////////////////////////////////////////////////////////////

//        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
//        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
////        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
////        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
//
//        try {
//            appliance = service.find(criteriaTabletPC);
//            PrintApplianceInfo.print(appliance);
//        } catch (ServiceException e) {
//            //log
//            System.out.println("Something is wrong");
//        }


//        Criteria criteria1 = new Criteria("VacuumCleaner");
//        criteria1.add("POWER_CONSUMPTION", 100);
//        criteria1.add("FILTER_TYPE", "A");
//
//        try {
//            appliance = service.find(criteria1);
//            PrintApplianceInfo.print(appliance);
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        }

    }
}
