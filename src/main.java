import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        GroceryProductFactory factory = new GroceryProductFactory();

        try {
            Scanner sc = new Scanner(new File("./product_list.txt"));

            while(sc.hasNextLine()){
                String name = sc.next();
                String price = sc.next();
                System.out.println(name);
                System.out.println(price);
                // String price = sc.next();
            }
        } catch (FileNotFoundException e){
            System.out.println("Product list file not found");
        }

        // factory.createProduct("Apple");

    }
}
