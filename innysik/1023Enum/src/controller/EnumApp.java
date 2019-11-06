package controller;

import data.DayOfTheWeek;
import data.Schedule;
import data.WeeksDay;

import java.util.Arrays;

public class EnumApp {

    public static void main(String[] args) {

        WeeksDay monday = WeeksDay.MONDAY; // to create the new object from Enum. new object named "monday" = Enum

        Schedule schedule = new Schedule(); // new object of Class Schedule
        schedule.setWeeksDay(WeeksDay.SUNDAY);
        schedule.wakeUp();

        schedule.getMenu(monday);
        schedule.getMenu(WeeksDay.FRIDAY);

        System.out.println(Arrays.toString(WeeksDay.values()));

        System.out.println(WeeksDay.MONDAY);

        System.out.println(WeeksDay.SUNDAY.ordinal());

        System.out.println(WeeksDay.valueOf("MONDAY"));
    }
}
