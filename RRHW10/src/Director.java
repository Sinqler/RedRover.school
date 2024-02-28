public class Director extends BaseManager{

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0){
            return super.getSalary() + super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9);
        } else {
            return super.getSalary();
        }
       // return super.getSalary();
    }

    @Override
    public int getNumberOfSubordinates() {
        return super.getNumberOfSubordinates();
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        super.setNumberOfSubordinates(numberOfSubordinates);
    }
}
