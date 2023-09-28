public class ProductFactoryProducer {
    public static GroceryProductFactory getFactory(boolean ripe){
        if(ripe){
            return new RipeProductFactory();
        }else{
            return new UnripeProductFactory();
        }
    }
}
