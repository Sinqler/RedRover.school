public class Worker  extends  Employee{

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public final double getSalary() {
        getBaseSalary();
        return 0;
    }
}
