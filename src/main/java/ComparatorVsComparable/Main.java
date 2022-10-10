package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Phones> phones = new ArrayList<>();
        //you can create object seperatly or create them while adding it to the list.
        // Phones iphone = new Phones("Apple","Red",450);


        phones.add(new Phones("Apple","Red",400));
        phones.add(new Phones("Dell","Black",300));
        phones.add(new Phones("Hp","Silver",555));

        //how to sort this array list

        //Collections.sort(phones);

        //^the above method does not work until you implement comparable interface in the class that you are trying to sort
        //do this by implementing Comparable<Name of class> into Phone Class
        //implement methods and fill method body
        //print out the sorted list by using for each loop

//        for (Phones x : phones){
//            System.out.println(x);
//        }

        //how to sort an array list without implementing a interafce in the class that needs to be sorted?
        //sort only cares about the logic
        //First create a new comparator object
        Comparator<Phones> p = new Comparator<Phones>() {
            @Override
            public int compare(Phones o1, Phones o2) {
                if (o1.getPrice() > o2.getPrice())
                    return 1;
                else
                    return  -1;
            }
        };

        //sort the list

        phones.sort(p);

        //create a for each loop to print the list

        for (Phones x :phones) {
            System.out.println(x);
        }

    }
}
