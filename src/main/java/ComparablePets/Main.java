package ComparablePets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many pets do you have?");

        int numPets = in.nextInt();
        in.skip(System.lineSeparator());

        Pet [] pets = new Pet[numPets];



        for(int i = 0; i < pets.length; i++){
            System.out.println("What kind of pet is it?");
            String petType = in.nextLine();
            String name;




            System.out.println("What is the name of your pet?");
            name = in.nextLine();


            if (petType.equalsIgnoreCase("Dragon")){

                pets[i] = new Dragon(name);

            } else if (petType.equalsIgnoreCase("dog")) {

                pets[i] = new Dog(name);

            } else if (petType.equalsIgnoreCase("cat")) {

                pets[i] = new Cat(name);
            }else {

                pets[i] = new Pet(name);
            }
        }

        for (int i =0; i< pets.length; i++){
            System.out.println(pets[i].getName() + " " + pets[i].speak());


        }





    }
}
