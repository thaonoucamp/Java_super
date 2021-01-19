package myPackage;

public class Employee extends Person{
  private int yearKN;
  public Employee() {

  }

  public Employee(String name, int yearKN) {
      super(name);
      this.yearKN = yearKN;
  }

    public int getYearKN() {
        return yearKN;
    }

    public void setYearKN(int yearKN) {
        this.yearKN = yearKN;
    }

    @Override
    public double rice() {
        if(this.yearKN < 1) {
            return super.rice() * 1.5;
        } else if (this.yearKN >= 1 && this.yearKN < 3) {
            return super.rice() * 2;
        } else {
            return super.rice() * 3;
        }
    }
}
