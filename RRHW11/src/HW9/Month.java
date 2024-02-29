package HW9;

public class Month {
    private MountEnum mountName;
    private int countOfDaysInMonth;
    private int countOfWorkingDaysInMonth;

    public  Month (MountEnum mountName, int countOfDaysInMonth, int countOfWorkingDaysInMonth){
        this.mountName = mountName;
        this.countOfDaysInMonth = countOfDaysInMonth;
        this.countOfWorkingDaysInMonth = countOfWorkingDaysInMonth;
    }

    public MountEnum getMountName() {
        return mountName;
    }

    public int getCountOfDaysInMonth() {
        return countOfDaysInMonth;
    }

    public int getCountOfWorkingDaysInMonth() {
        return countOfWorkingDaysInMonth;
    }
}
enum MountEnum{
   January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}
