package Enums;

public class Main {

    public static void main(String[] args) {


        //enum is used when you have something that has a preassigned set of values, like days in a week

        //Because enums are preassigned you cannot use new keyword to create a enum object.
        //instead use the existing value
        DaysOfTheWeek day1 = DaysOfTheWeek.FRIDAY;

        if (day1 == DaysOfTheWeek.THURSDAY){
            System.out.println("Its almost Friday!");

        }
        //The above method does not print anything because the value of day1 is already Friday, therefore day1 does not
        //meet the condition.

        if (day1 == DaysOfTheWeek.FRIDAY){
            System.out.println("Its Friday, Friday, Gotta get down on Friday");
        }


        //how to return an array of all the enums

        for (DaysOfTheWeek x : DaysOfTheWeek.values()){
            System.out.println(x);

        }


        //Months Enum
        //How to change a value of a certain enum

        //Months.JANUARY.numberOfDays = 5;

        //because we declared the number of days as a final we cannot change it .

        //how to print out the number of days
        System.out.println(Months.JANUARY.numberOfDays);















    }
}
