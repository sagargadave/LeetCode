/*
1185. Day of the Week

Given a date, return the corresponding day of the week for that date.
The input is given as three integers representing the day, month and year respectively.
Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Note: January 1, 1971 was a Friday.

Example 1:

Input: day = 31, month = 8, year = 2019
Output: "Saturday"

Example 2:

Input: day = 18, month = 7, year = 1999
Output: "Sunday"

Example 3:

Input: day = 15, month = 8, year = 1993
Output: "Sunday"

Constraints:
The given dates are valid dates between the years 1971 and 2100.

Solution :
*/

class Solution {
    public static String dayOfTheWeek(int day, int month, int year) {
        // Weekday names with Sunday at index 0
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Number of days passed since 1971-01-01 to the given date (exclusive)
        int totalDays = 0;
        
        // 1) Add days for whole years from 1971 up to year-1
        for (int y = 1971; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        
        // 2) Days in months for the target year (before the given month)
        int[] mdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int m = 1; m < month; m++) {
            totalDays += mdays[m - 1];
        }
        
        // 3) If current year is leap and month is after February, add 1 day
        if (month > 2 && isLeapYear(year)) {
            totalDays += 1;
        }
        
        // 4) Add days in current month (day-1 because we count days passed before the given day)
        totalDays += (day - 1);
        
        // 1971-01-01 was a Friday. In our `days` array Friday is index 5.
        int indexOfFriday = 5;
        
        // Final weekday index
        int weekdayIndex = (totalDays + indexOfFriday) % 7;
        
        return days[weekdayIndex];
    }
    
    private static boolean isLeapYear(int y) {
        // standard leap year rules
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}