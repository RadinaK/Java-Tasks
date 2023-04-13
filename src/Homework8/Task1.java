package Homework8;

class Date {
    int day;
    int month;
    int year;

    Date(String s) {
        String[] input = s.split("-");
        day = Integer.parseInt(input[0]);
        month = Integer.parseInt(input[1]);
        year = Integer.parseInt(input[2]);
    }
}

public class Task1 {
    public static void main(String[] args) {
//        Задача 1. брой дни между дати
//        да се напише функия която получава като параметър 2 стринга и връща число.
//        входнте стрингов представлявата дата във формат 11-06-2021.
//        функцията да връща броя дни между двете дати.
//
//        По лесен вариант - ако двете дати са в една и съща година.
//        Пример:
//        "11-06-2021", "12-06-2021" => 1
//        "1-01-2021", "1-02-2021" => 31
        String s1 = "01-01-2022";
        String s2 = "05-03-2022";
        System.out.println(calculateDifferance(s1, s2));
    }

    private static int calculateDifferance(String s1, String s2) {
        Date date1 = new Date(s1);
        Date date2 = new Date(s2);

        int days1 = countDaysFromStartYear(date1.day, date1.month, date1.year);
        int days2 = countDaysFromStartYear(date2.day, date2.month, date2.year);

        return days2 - days1;
    }

    static final int[] DAYS_IN_MONTH = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    private static int countDaysFromStartYear(int day, int month, int year) {
        int daySum = day + DAYS_IN_MONTH[month];
        if (checkLeapYear(year) && month > 2) {
            daySum++;
        }

        return daySum;
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
