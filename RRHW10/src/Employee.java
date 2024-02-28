public abstract class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double getSalary();

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        baseSalary = baseSalary;
    }
}
