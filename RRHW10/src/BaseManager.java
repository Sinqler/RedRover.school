public abstract class BaseManager extends Employee{
    private int numberOfSubordinates;

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
}
