package HW9;

public class MonthUtils {


    static final Month january = new Month(MountEnum.January, 31,20);
    static final Month february = new Month(MountEnum.February, 28,20);
    static final Month march = new Month(MountEnum.March, 31,20);
    static final Month april = new Month(MountEnum.April, 30,20);
    static final Month may = new Month(MountEnum.May, 31,20);
    static final Month june = new Month(MountEnum.June, 30,20);
    static final Month july = new Month(MountEnum.July, 31,20);
    static final Month august = new Month(MountEnum.August, 31,20);
    static final Month september = new Month(MountEnum.September, 31,20);
    static final Month october = new Month(MountEnum.October, 31,20);
    static final Month november = new Month(MountEnum.November, 31,20);
    static final Month december = new Month(MountEnum.December, 31,20);

    public Month getMarch() {
        return march;
    }

    public Month getApril() {
        return april;
    }

    public final static Month[] All_months = {
        january, february, march, april, may, june,
    july, august, september, october, november, december
    };

    public final static Month[] spring = {
        march, april, may
    };

    public final static Month[] summer = {
        june, july, august
    };

    public final static Month[] autumn = {
        september, october, november
    };

    public final static Month[] winter = {
        january, february, december
    };

    public final static Month[] firstSemester = {
        january, february, march, april, may, june
    };

    public final static Month[] secondSemester = {
        july, august, september, october, november, december
    };
}
