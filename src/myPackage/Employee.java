package myPackage;

public class Employee extends Person{
    private double rice;

    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, double rice) {
        super(name);
        this.rice = rice;
    }

    public double getRice() {
        return rice;
    }

    public void setRice(double rice) {
        this.rice = rice;
    }

}
