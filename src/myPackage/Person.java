package myPackage;

public class Person {
    private final double RICE_SIMPLE = 1000;
    private String name;
    private Add add;

    public Person() {

    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Add getAdd() {
        return add;
    }

    public void setAdd(Add add) {
        this.add = add;
    }

    public double rice() {
        return RICE_SIMPLE;
    }

}
