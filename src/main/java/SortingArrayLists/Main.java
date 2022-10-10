package SortingArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add(0,"Honda");
        cars.add(1,"Benz");
        cars.add(2,"BMW");
        cars.add(3,"Toyota");

        Collections.sort(cars, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String x : cars) {
            System.out.println(x);

        }



    }





}
