public final class Director extends BaseManager {

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    final int c = 9;
//    @Override
//    public double getSalary() {
//        if (getNumberOfSubordinates() > 0){
//            return super.getSalary() + super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9);
//        } else {
//            return super.getSalary();
//        }
//       // return super.getSalary();
//    }
//final double coefficientD = getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);


    @Override
    public int getNumberOfSubordinates() {
        return super.getNumberOfSubordinates();
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        super.setNumberOfSubordinates(numberOfSubordinates);
    }

    final double coefficientD() {
        return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * c);
    }

    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() + coefficientD();
        } else {
            return getBaseSalary();
        }
    }
}
