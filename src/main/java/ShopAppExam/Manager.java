package ShopAppExam;

public class Manager extends Employee implements Discountable{

    public static final double DISCOUNT = .25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }




    @Override
    void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * DISCOUNT;
    }
}
