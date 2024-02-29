package HW9.employes;

import HW9.Month;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private int salaryPerDay;

    public Employee(String name, int age, char gender, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public double getSalary(Month[] monthArray){
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].getCountOfWorkingDaysInMonth() * getSalaryPerDay();
        }
        return salary;
    }

}
