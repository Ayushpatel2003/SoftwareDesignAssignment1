import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("./product_list.txt"));

            while(sc.hasNextLine()){
                String ripe = sc.next();
                String name = sc.next();
                String price = sc.next();
                GroceryProductFactory factory = ProductFactoryProducer.getFactory(
                    ripe.equals("Ripe")
                );

                Product product = factory.createProduct(name);
                System.out.println("Created product type "+product.name+" in main inventory");

                product.setPrice( Double.parseDouble(price.substring(1)) );
                System.out.println("Set price "+product.price+" for "+product.name);
            }

            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Product list file not found");
        }

    }
}
