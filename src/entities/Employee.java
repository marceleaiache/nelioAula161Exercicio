package entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;


    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Employee() {

    }

    //METÓDO CONSTRUTOR COM ARGUMENTOS
    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    //MÉTODOS GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    //MÉTODO FUNÇÃO
    public double payment() {
        return valuePerHour * hours;
    }
}
