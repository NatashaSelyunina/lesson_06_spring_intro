package app.code;

import app.staff.administration.Director;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        MachineOperator machineOperator = new MachineOperator();
//        Storekeeper storekeeper = new Storekeeper();
//
//        Merchandiser merchandiser = new Merchandiser();
//        SalesManager salesManager = new SalesManager();
//
//        Secretary secretary = new Secretary();
//
//        ProductionChief productionChief = new ProductionChief();
//        productionChief.setMachineOperator(machineOperator);
//        productionChief.setStorekeeper(storekeeper);
//
//        SalesChief salesChief = new SalesChief();
//        salesChief.setSalesManager(salesManager);
//        salesChief.setMerchandiser(merchandiser);
//
//        Director director = new Director();
//        director.setProductionChief(productionChief);
//        director.setSecretary(secretary);
//        director.setSalesChief(salesChief);
//
//        director.manageCompany();
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Director director = context.getBean(Director.class);
        director.manageCompany();
    }
}
