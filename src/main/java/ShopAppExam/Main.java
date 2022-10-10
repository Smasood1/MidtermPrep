package ShopAppExam;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        Clothing clothing1 = new Clothing("Red Shirt",25.00,'M');
        Clothing clothing2 = new Clothing("Black Sweater",35.00,'S');
        Clothing clothing3 = new Clothing("White Jacket",55.00,'L');

        Clothing [] managerCart = {clothing1,clothing2,clothing3};

        Manager manager1 = new Manager("Saad",managerCart,'M');

        Clothing [] employeeCart = {clothing1,clothing2,clothing3};

        HourlyEmployee employee1 = new HourlyEmployee("Huri",employeeCart,'S');

        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println(ShopApp.isAFit(manager1,clothing1));
        employee1.printEmpPriceAfterDisc(clothing2);
        manager1.printEmpPriceAfterDisc(clothing2);

        ArrayList<Clothing> list = new ArrayList<Clothing>();

        //when adding list


        list.add(0,clothing1);
        list.add(1,clothing2);
        list.add(2,clothing3);

        //print items in array using for each loop
        for(Clothing x : list){
            System.out.println(x);
        }

        ShopApp.sortAndPrintClothingByPrice(list);
        ShopApp.printEmployeeName(employee1);
        ShopApp.printEmployeeName(manager1);

        Discountable [] discountables = {manager1,employee1};
        ShopApp.printDiscAmtOff(discountables,clothing2);











    }
}
