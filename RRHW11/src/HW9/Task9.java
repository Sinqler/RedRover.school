package HW9;

import HW9.employes.Employee;

public class Task9 {

    public static void main(String[] args) {

        Month[] m = new Month[]{MonthUtils.march, MonthUtils.april};
        Employee Den = new Employee("Dan", 35, 'M', 100);
        Manager Barbara = new Manager("barbara",7,'ж', 105, 5);

        System.out.println(Den.getSalary(MonthUtils.firstSemester));
        System.out.println(Barbara.getSalary(MonthUtils.autumn));
    }
}
