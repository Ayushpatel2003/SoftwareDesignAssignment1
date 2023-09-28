class GroceryProductFactory {

    public Product createProduct(String type){
        if (type.equals("Apple"))return new Apple();
        if (type.equals("Banana"))return new Banana();
        if (type.equals("Peach"))return new Peach();
        if (type.equals("Orange"))return new Orange();
        if (type.equals("Mango"))return new Mango();
        return null;
    }

}
