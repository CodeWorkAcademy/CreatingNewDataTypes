package com.company;


    public class StartHere {
        public static void main(String[] args){
            DateProcessor dp = new DateProcessor();
            dp.month = 5;
            dp.day = 23;
            dp.year = 1995;

            System.out.printf("Java was born on %s\n", dp.displayDate());
        }
    }

