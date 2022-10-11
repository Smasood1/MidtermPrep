package Enums;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    //Its good practice to uppercase all your enums and write them out on new lines.
    //We can add parameters to each enum, such as number of days.

   final int numberOfDays;

    //we make this final because we cannot change a fixed value since enums are preassigned and dont change.//however if we want to change we run this command in main:
    //Months.JANUARY.numberOfDays = 5;
    // generate constructor

    Months(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    //Now all the enums are red because we need to fill in the parameters.

    //
}
