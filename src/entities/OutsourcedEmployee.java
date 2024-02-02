package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public OutsourcedEmployee() {
        super();
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //MÉTODOS CONSTRUTORES
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
