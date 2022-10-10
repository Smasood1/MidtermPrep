package ComparatorVsComparable;

public class Phones{
    //Comparable<Phones>
    //implementing comparable interface into the class

    private String brand;
    private String color;
    private int price;

    public Phones(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //change the parameter of the method to compare the current object with the 2nd


//    @Override
//    public int compareTo(Phones phones2) {
//        if (this.price > phones2.getPrice())
//            //you can return any positive number
//            return 1;
//
//        else
//            //return any negative number
//            return -1;
//    }
}
