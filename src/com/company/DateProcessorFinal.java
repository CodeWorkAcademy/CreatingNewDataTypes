package com.company;

public class DateProcessorFinal {

    private int month = 1;
    private int day = 1;
    private int year = 1970;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >0 && month<=12){
            this.month = month;
        }
    }

    public int getNumberDaysInMonth() {
        // 30 days hath September, April, June and November

        // since we're defaulting to 31, we could actually skip
        // the first 7 cases
        int lastDay = 31;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            case 11:
            case 4:
            case 9:
            case 6:
                lastDay = 30;
                break;
            case 2:
                if (isLeapYear()){
                    lastDay = 29;
                }else{
                    lastDay = 28;
                }
                break;
        }

        return lastDay;
    }

    public boolean isLeapYear(){
        // returns t/f if the year is a leap year
        // leap years are all years divisible by 4 but not 100
        // years that are divisible by 400 are leap years, too
        // is it divisible by 4?

        // Note that the year is not passed as an argument. It could be but
        // I choose to use the class level private variable for my method.
        boolean bLeapYear = false;
        bLeapYear = (year % 4 == 0);

        // is it divisible by 4 and not 100
        bLeapYear = bLeapYear && (year % 100 != 0);

        // is it divisible by 4 and not 100 unless it's divisible by 400
        bLeapYear = bLeapYear || (year % 400 == 0);

        return bLeapYear;
    }

    public void setDay(int day) {
        if (day <= getNumberDaysInMonth() && day >=1){
            this.day = day;
        }else{
            day = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1 && year <=4000){
            this.year = year;
        }else{
            this.year = 1970;
        }
    }



    public String displayDate(){
        return month + "-" + day + "-" + year;

    }

}

