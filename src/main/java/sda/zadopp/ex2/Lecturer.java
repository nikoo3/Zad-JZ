package sda.zadopp.ex2;

public class Lecturer extends Person{
    private String spec;
    private double salary;

    public Lecturer (){}

    Lecturer(String name, String address, String spec, double salary){
        super(name, address);
        this.spec = spec;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "spec='" + spec + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
