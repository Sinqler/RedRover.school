public final class Manager extends BaseManager {


    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

//    @Override
//    public double getSalary() {
//        if (getNumberOfSubordinates() > 0) {
//            return super.getSalary() + super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3);
//        } else {
//            return super.getSalary();
//        }
//    }






    public double getSalary(){
        final double coefficient = getBaseSalary() * (getNumberOfSubordinates() /100 *3);
        if (getNumberOfSubordinates() > 0){
            return getBaseSalary() + getBaseSalary() * coefficient;
        } else {
            return getBaseSalary();
        }
    }
}
