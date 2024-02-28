public abstract class BaseManager extends Employee {

    private int numberOfSubordinates;
    int c = 0;



    public BaseManager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100 * c);
        } else {
            return getBaseSalary();
        }
    }

}
