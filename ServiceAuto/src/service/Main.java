package service;

import service.Car;
import service.iServiceAuto;

public class Main {
    public static void main(String args[])
    {
        iServiceAuto car1=new Car();
        car1.setCar("Audi Q5");
        car1.setRepair("Parbriz");
        car1.Pay();
        System.out.println("for "+car1.getRepair());
    }
}
