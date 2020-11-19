package service;

public class Car implements iServiceAuto {
    private String car;
    private String repair;

    @Override
    public void setCar(String car) {
        this.car=car;
    }

    @Override
    public void setRepair(String repair) {
        this.repair=repair;
    }

    @Override
    public String getCar() {
        return this.car;
    }

    @Override
    public String getRepair() {
        return this.repair;
    }

    @Override
    public void Pay() {
        System.out.println("Pay did by: " +this.car);
    }
}
