class UnripeProductFactory implements GroceryProductFactory {

    public Product createProduct(String type){
        if (type.equals("Apple"))return new UnripeApple();
        if (type.equals("Banana"))return new UnripeBanana();
        return null;
    }

}
