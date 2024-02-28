public class Manager extends BaseManager {


    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return super.getSalary() + super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        } else {
            return super.getSalary();
        }
    }
}
