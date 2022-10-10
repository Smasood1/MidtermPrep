package ShopAppExam;

import java.util.ArrayList;
import java.util.Comparator;

public class ShopApp {

    public static double calcTotal(Clothing [] clothing) {

        double sum = 0;
        for (int i = 0; i < clothing.length; i++) {
            sum += clothing[i].getPrice();


        }
        return sum;
    }

    public static boolean isAFit(Customer customer,Clothing clothing){
        if(customer.getSize() != clothing.getSize()){
            return false;
        }else return true;
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> list){
        //sort array list
       list.sort(Comparator.comparingDouble(Clothing::getPrice));

       list.forEach(System.out::println);
    }

    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }

    public static void printDiscAmtOff(Discountable[] discountables,Clothing clothing){
     for (int x = 0; x < discountables.length; x++){
         System.out.println(discountables[x].calcDiscount(clothing));
     }
    }
}
