package Practice_16_enum;

public class Task1{
    enum Day {
    MONDAY( true),
    TUESDAY( true),
    WEDNESDAY( true),
    THURSDAY( true),
    FRIDAY( true),
    SATURDAY( true),
    SUNDAY( false);

    private boolean stadingDay;

    Day(boolean workingDay) {
        this.stadingDay = stadingDay;
    }


    public boolean isStadingDay() {
        return this.stadingDay;
    }
}
    public static void main(String[] args){
        Day today = Day.MONDAY;
        System.out.println("Do we have lectures at Monday? " + today.isStadingDay());
        today = Day.SUNDAY;
        System.out.println("Do we have lectures at Sunday? " + today.isStadingDay());
    }
}