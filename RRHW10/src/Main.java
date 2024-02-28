
public class Main {

//    static Worker worker1 = new Worker("John", 1000);
//    static Worker worker2 = new Worker("Jim", 1200);
//    static Worker worker3 = new Worker("Nick", 1400);
//    static Worker worker4 = new Worker("Tom", 1600);
//
//    static Manager manager1 = new Manager("Kate", 10000, 3);
//    static Manager manager2 = new Manager("Ann", 10000, 4);
//    static Manager manager3 = new Manager("Tim", 10000, 5);
//    static Manager manager4 = new Manager("Bill", 10000, 6);
//
//    static Director director1 = new Director("Piter",15000, 10);
//    static Director director2 = new Director("Jane",25000, 20);
//
//    static Worker[] arrWorker = new Worker[]{worker1, worker2, worker3, worker4};
//    static Manager[] arrManager = new Manager[]{manager1, manager2, manager3, manager4};
//    static Director[] arrDirector = new Director[]{director1, director2};
//
//    static Employee[]  arrEmployee = new Employee[]{worker1, worker2, worker3, worker4, manager1, manager2, manager3, manager4, director1, director2};

    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 1000);
        Worker worker2 = new Worker("Jim", 1200);
        Worker worker3 = new Worker("Nick", 1400);
        Worker worker4 = new Worker("Tom", 1600);

        Manager manager1 = new Manager("Kate", 10000, 3);
        Manager manager2 = new Manager("Ann", 10000, 4);
        Manager manager3 = new Manager("Tim", 10000, 5);
        Manager manager4 = new Manager("Bill", 10000, 6);

        Director director1 = new Director("Piter", 15000, 10);
        Director director2 = new Director("Jane", 25000, 20);

        Worker[] arrWorker = new Worker[]{worker1, worker2, worker3, worker4};
        Manager[] arrManager = new Manager[]{manager1, manager2, manager3, manager4};
        Director[] arrDirector = new Director[]{director1, director2};
        BaseManager[] bm = new BaseManager[]{manager1, manager2, manager3, manager4, director1,
            director2};

        Employee[] arrEmployee = new Employee[]{worker1, worker2, worker3, worker4, manager1,
            manager2, manager3, manager4, director1, director2};

        Employee tempEmployee = Utils.getEmployeeByName(arrEmployee, "Tim");
        System.out.println(
            "Name: " + tempEmployee.getName() + " Salary: " + tempEmployee.getSalary());

        int tempEmployee2 = Utils.getEmployeeBySubString(arrEmployee, "ш");

        if (tempEmployee2 != -1) {
            System.out.println("subString founded");
        } else {
            System.out.println("subString NOT founded");
        }

        System.out.println("budget for salary: " + Utils.getBudget(arrEmployee));
        System.out.println("min salary: " + Utils.getMinSalary(arrEmployee));
        System.out.println("max salary: " + Utils.getMaxSalary(arrEmployee));
        System.out.println(("min workers: " + Utils.getMinWorkers(bm)));
        System.out.println(("max workers: " + Utils.getMaxWorkers(bm)));
        System.out.println(("min bonus: " + Utils.getMinBonus(bm)));
        System.out.println(("max bonus: " + Utils.getMaxBonus(bm)));
    }
}