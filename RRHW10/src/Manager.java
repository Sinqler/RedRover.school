public final class Manager extends BaseManager {

    final int c = 3;


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


    //    public double getSalary() {
//        final double coefficientM = getBaseSalary() * (getNumberOfSubordinates() / 100 * 3);
//        if (getNumberOfSubordinates() > 0) {
//            return getBaseSalary() + coefficientM;
//        } else {
//            return getBaseSalary();
//        }
//    }
    public double getSalary() {
        final double coefficientM = getBaseSalary() * (getNumberOfSubordinates() / 100.0 * c);
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() + coefficientM;
        } else {
            return getBaseSalary();
        }
    }

}
