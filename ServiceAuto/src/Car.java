public class Car implements iServiceAuto{
    private String car;
    private String repaire;

    @Override
    public void setCar(String car) {
        this.car=car;
    }

    @Override
    public void setRepare(String repaire) {
        this.repaire=repaire;
    }

    @Override
    public String getCar() {
        return this.car;
    }

    @Override
    public String getRepare() {
        return this.repaire;
    }

    @Override
    public void Pay() {
        System.out.println("Pay did by: " +this.car);
    }
}
