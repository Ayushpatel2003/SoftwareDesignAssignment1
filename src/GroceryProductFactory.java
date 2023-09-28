class GroceryProductFactory {

    public Product createProduct(String type){
        if (type.equals("Apple"))return new Apple();
        if (type.equals("Banana"))return new Banana();
        return null;
    }

}
