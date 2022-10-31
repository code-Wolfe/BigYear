import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        label:
        while (true) {
            System.out.println("?");
            String userIn = scan.nextLine();

            switch (userIn) {
                case "Add": {
                    System.out.println("Name:");
                    String name = scan.nextLine();
                    System.out.println("Name in Latin:");
                    String latinName = scan.nextLine();

                    Bird b = new Bird(name, latinName);
                    //
                    birds.add(b);
                    break;
                }
                case "Observation": {
                    System.out.println("Bird?");
                    String name = scan.nextLine();
                    if (contains(birds, name)) {
                        for (Bird b : birds) {
                            if (b.getName().equals(name)) {
                                b.observe();
                            }
                        }
                    } else {
                        System.out.println("Not a bird!");
                    }


                    break;
                }
                case "All":


                    for (Bird b : birds) {
                        System.out.println(b.toString());
                    }
                    break;
                case "One": {
                    System.out.println("Bird?");
                    String name = scan.nextLine();

                    for (Bird b : birds) {
                        if (b.getName().equals(name)) {
                            System.out.println(b);
                        }
                    }

                    break;
                }
                case "Quit":
                    break label;
            }
        }

    }

    public static boolean contains(ArrayList<Bird> birds, String name){

        for (Bird b: birds){
            if(b.getName().equals(name)){
                return true;
            }
        }
        return false;
    }



}