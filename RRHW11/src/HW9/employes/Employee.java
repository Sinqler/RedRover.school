package HW9.employes;

import HW9.Month;

public final class Employee extends BaseEmployee {


    public Employee(String name, int age, char gender, int salaryPerDay) {
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
        return super.getSalary(monthArray);
    }
}
