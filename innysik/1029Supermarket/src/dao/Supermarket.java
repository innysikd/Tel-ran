package dao;

import data.Product;
import data.VegetablesProduct;

public class Supermarket {

    private Product[] products;
    private int size;

    public Supermarket (int capacity){
        products = new Product[capacity];
        size = 0;
    }

    public void display(){
        for (int i = 0; i<size; i++){
            System.out.println(products[i]);
        }
    }

    public boolean addProduct(Product product){
        if (size<products.length){
            products[size] = product;
                size++;
                return true;
            }
        return false;
    }

    public boolean deleteProduct (long barCode){
        for (int i = 0; i<size; i++){
            if (products[i].getBarCode() == barCode);
            products[i] = products[size-1];
            size--;
            return true;
        }
        return false;
    }

    public Product findByBarCode (long barCode){
        for (int i = 0; i<size; i++) {
            if (products[i].getBarCode() == barCode) {
                return products[i];
            }
        }
        return null;
    }

    public Product[] findByBrand (String brand, int numberOfItems) {  //we want to return not each item printed, but all the items
        //in one array. so we have to create a new array first
        Product[] brandProducts = new Product[numberOfItems];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (products[i].getBrand().equalsIgnoreCase(brand) && j < numberOfItems) {
                brandProducts[j] = products[i];
                j++;
            }
        }
        return brandProducts;
    }

    public double totalPriceOfOneBrand (String brand){
        double totalPrice = 0;
        for (int i = 0; i < size; i++) {
            if (products[i].getBrand().equalsIgnoreCase(brand)){
                totalPrice = products[i].getPrice() + totalPrice;
            }
        }
        return totalPrice;
    }

    public Product[] displayBio (int number){
        VegetablesProduct[] bioProducts = new VegetablesProduct[number];
        int j = 0;
        for (int i = 0; i < size; i++){
            if (products[i].getClass().getSimpleName().equalsIgnoreCase("VegetablesProduct")){  // turns class name into string
                bioProducts[j] = (VegetablesProduct) products[i]; //here we customise our product. we say that it belongs not only
                //to class Product, but also to inherited class VegetablesProduct
                if (bioProducts[j].isBio()){
                    j++;
                }
            }
        }
        return bioProducts;
    }




}

