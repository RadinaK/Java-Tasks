package Homework7;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1. присъствие на ученици
//        да се напише функция която получава като параметър стринг и
//        връщ стойност от тип boolean. стринга съдържа поредица от букви,
//        всяка от които отоваря на опредлен учебен ден и показва дали ученика е присъствал:
//
//        възможните букви са:
//        О - отсъства
//        З - закъснял
//        П - присъства
//        функцията ще се ползва да се провери дали ученика може да премине в
//        следващ срок и връща true ако няма твърде много отсъствия.
//
//                това се определя по следните правила:
//        ученика не е отсъствал повече от 2 пъти
//        ученика не е закъснявал в 3 или повече последователни дни
//        Пример:
//        'ППОЗЗП' =>  true
//        'ППОЗЗЗ' => false
        String s = "ППОЗЗЗ";
        System.out.println(passNextCourse(s));
    }

    private static boolean passNextCourse(String s) {
        int absences = 0, delays = 0;
        int[] days = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char state = s.charAt(i);
            switch (state) {
                case 'О':
                    absences++;
                    if (absences == 2) {
                        return false;
                    }
                    break;
                case 'З':
                    delays++;
                    days[i] = 1;
                    break;
            }
        }

        if (delays <= 3) {
            return true;
        }

        for (int i = 0; i < days.length - 2; i++) {
            if (days[i] == 1 && days[i + 1] == 1 && days[i + 2] == 1) {
                return false;
            }
        }

        return true;
    }
}
