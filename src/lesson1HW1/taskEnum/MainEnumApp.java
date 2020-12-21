package lesson1HW1.taskEnum;

public class MainEnumApp {
    public static void main(String[] args) {

        int workingHours = 0;
        final int MAX_WORK_DAY = 5;

        DayOfWeek dayOfWeekTest = DayOfWeek.Friday;
        if (dayOfWeekTest.ordinal() != 5 && dayOfWeekTest.ordinal() != 6 ){

            workingHours = (MAX_WORK_DAY - dayOfWeekTest.ordinal())*8;
            System.out.println("Вам осталось работать " + workingHours +" часов!!!");
        } else {
            System.out.println("У вас выходные!!!");
        }
    }
}
