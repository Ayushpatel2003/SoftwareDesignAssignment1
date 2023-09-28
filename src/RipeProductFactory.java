class RipeProductFactory implements GroceryProductFactory {

    public Product createProduct(String type){
        if (type.equals("Apple"))return new RipeApple();
        if (type.equals("Banana"))return new RipeBanana();
        return null;
    }

}
