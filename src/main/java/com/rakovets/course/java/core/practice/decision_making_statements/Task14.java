package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить название года по китайскому календарю, если считать что нет никаких циклических смещений, т.е.
 * нижеприведенный цикл повторяется для любых 12 лет после 0 н.э..
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 */
class Task14 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int year = 1986;

        String monthName = getZodiacYearName(year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет назания года по китайскому календарю.
     *
     * @param year год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int year) {
        final int monthNumber = 12;
        if (year > 0) {
            if (year % monthNumber == 0) {
                return "Monkey";
            } else if (year % monthNumber == 1) {
                return "Rooster";
            } else if (year % monthNumber == 2) {
                return "Dog";
            } else if (year % monthNumber == 3) {
                return "Pig";
            } else if (year % monthNumber == 4) {
                return "Rat";
            } else if (year % monthNumber == 5) {
                return "Ox";
            } else if (year % monthNumber == 6) {
                return "Tiger";
            } else if (year % monthNumber == 7) {
                return "Rabbit";
            } else if (year % monthNumber == 8) {
                return "Dragon";
            } else if (year % monthNumber == 9) {
                return "Snake";
            } else if (year % monthNumber == 10) {
                return "Horse";
            } else if (year % monthNumber == 11) {
                return "Ram";
            }
        }
        return "Undefined";
    }
}
