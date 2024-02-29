public class Utils {
//    Необходимо создать утилитарный класс со следующими методами:
//   1 поиск сотрудника в массиве по его имени
//   2 поиск сотрудника в массиве по вхождению указанной строки в его имени
//   3 подсчет зарплатного бюджета для всех сотрудников в массиве
//   4 поиск наименьшей зарплаты в массиве
//   5 поиск наибольшей зарплаты в массиве
//   6 поиск наименьшего количества подчиненных в массиве менеджеров
//   7 поиск наибольшего количества подчиненных в массиве менеджеров
//   8 поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//   9 поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static Employee getEmployeeByName(Employee[] arrEmployee, String name) {
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getName().equalsIgnoreCase(name)) {
                return arrEmployee[i];
            }
        }
        throw new RuntimeException("not found employee");
    }

    public static int getEmployeeBySubString(Employee[] arrEmployee, String subString) {
        for (Employee employee : arrEmployee) {
            if (employee.getName().indexOf(subString) != -1) {
                return 1;
            }
        }
        return -1;
    }


    public static double getBudget(Employee[] arrEmployee) {
        double budget = 0;
        for (int i = 0; i < arrEmployee.length; i++) {
            budget += arrEmployee[i].getSalary();
        }
        return budget;
    }

    public static double getMinSalary(Employee[] arrEmployee) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < arrEmployee.length; i++) {
            if (min > arrEmployee[i].getSalary()) {
                min = arrEmployee[i].getSalary();
            }
        }
        return min;
    }

    public static double getMaxSalary(Employee[] arrEmployee) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arrEmployee.length; i++) {
            if (max < arrEmployee[i].getSalary()) {
                max = arrEmployee[i].getSalary();
            }
        }
        return max;
    }

    public static int getMinWorkers(BaseManager[] bm) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bm.length; i++) {
            if (min > bm[i].getNumberOfSubordinates()) {
                min = bm[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int getMaxWorkers(BaseManager[] bm) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bm.length; i++) {
            if (max < bm[i].getNumberOfSubordinates()) {
                max = bm[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    public static double getMinBonus(BaseManager[] bm) {

        double minBonus = 999999.0;
        for (int i = 0; i < bm.length; i++) {
            if (minBonus > bm[i].getSalary() - bm[i].getBaseSalary()) {
                minBonus = bm[i].getSalary() - bm[i].getBaseSalary();
            }
        }

        return minBonus;
    }

    public static double getMaxBonus(BaseManager[] bm) {
        //double maxBonus = Double.MIN_VALUE;
        double maxBonus = 0.0;
        for (int i = 0; i < bm.length; i++) {
            if (maxBonus < bm[i].getSalary() - bm[i].getBaseSalary()) {
                maxBonus = bm[i].getSalary() - bm[i].getBaseSalary();
            }
        }

        return maxBonus;
    }

}



