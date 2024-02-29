package HW.HW9;

public class MonthUtils {


    static Month january = new Month(MountEnum.January, 31,20);
    static Month february = new Month(MountEnum.February, 28,20);
    static Month march = new Month(MountEnum.March, 31,20);
    static Month april = new Month(MountEnum.April, 30,20);
    static Month may = new Month(MountEnum.May, 31,20);
    static Month june = new Month(MountEnum.June, 30,20);
    static Month july = new Month(MountEnum.July, 31,20);
    static Month august = new Month(MountEnum.August, 31,20);
    static Month september = new Month(MountEnum.September, 31,20);
    static Month october = new Month(MountEnum.October, 31,20);
    static Month november = new Month(MountEnum.November, 31,20);
    static Month december = new Month(MountEnum.December, 31,20);

    public Month getMarch() {
        return march;
    }

    public Month getApril() {
        return april;
    }

    public static Month[] All_months = {
        january, february, march, april, may, june,
    july, august, september, october, november, december
    };
}
