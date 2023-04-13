package Test3;

import sun.util.calendar.CalendarUtils;

import java.util.Calendar;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2
//        да се напише функция която по зададена дата да връща деня от седмицата за тази дата.
//        датата ще бъде зададена като стринг, съответните символи отговарят на ден, месец, година: дд-мм-гггг
//
//        Забележки:
//        да не се ползва вградния Date обект
//        да не се ползва готов алгоритъм копиран от интернет
//        Пример:
//        "30-11-2021" => 2 (вторник)
//        String s = "30-11-2021";
        String s = "10-08-2022";
        System.out.println(returnDay(s));
//        System.out.println(getNumberOfDays(2020));
    }

    static final int[] DAYS_IN_MONTH = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};


    static final int SATURDAY = 5;    // Monday-0, Tuesday-1, Wednesday-2, Thursday-3, Friday-4, Saturday-5, Sunday-6

    private static int returnDay(String s) {
        String[] input = s.split("-");
        int date = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int year = Integer.parseInt(input[2]);

        //01.01.2022 - > 5
        int dayInWeek = countDaysFromStartYear(date, month, year);

        return (dayInWeek + SATURDAY) % 7;
    }

    private static int countDaysFromStartYear(int date, int month, int year) {
        int days = date + DAYS_IN_MONTH[month];
        if (checkLeapYear(year)) {
            days++;
        }

        return days;
    }

    private static boolean checkLeapYear(int year) {
        //Algorithm
        //If year is divisible by 400 then it is leap year
        //OR
        //If year is divisible by 4 but not by 100, then it is leap year

        return ((year % 400 == 0) ||
                ((year % 4 == 0) && (year % 100 != 0)));
    }
}
