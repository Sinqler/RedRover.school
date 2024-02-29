package HW.HW9;

import HW.HW9.employes.Employee;

public class Manager extends Employee {

    private int countOfEmployee;

    public Manager(String name, int age, char gender, int salaryPerDay, int countOfEmployee) {
        super(name, age, gender, salaryPerDay);
        this.countOfEmployee = countOfEmployee;
    }

    public int getCountOfEmployee() {
        return countOfEmployee;
    }

    public void setCountOfEmployee(int countOfEmployee) {
        this.countOfEmployee = countOfEmployee;
    }

    public Manager(String name, int age, char gender, int salaryPerDay) {
        super(name, age, gender, salaryPerDay);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public void setSalaryPerDay(int salaryPerDay) {
        super.setSalaryPerDay(salaryPerDay);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public int getSalaryPerDay() {
        return super.getSalaryPerDay();
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double percentageForTheEmployees = super.getSalary(monthArray) * 0.01 * getCountOfEmployee();
        return super.getSalary(monthArray) + percentageForTheEmployees;
    }
}
