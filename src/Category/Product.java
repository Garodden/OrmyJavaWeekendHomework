package Category;

import java.math.BigDecimal;

public class Product {
    protected String name;
    protected BigDecimal price;
    protected Double weight;

    public Product(){
        this.name="no input";
        this.price = new BigDecimal(0);
        this.weight = 0D;
    }
    public Product(String name, int price, double weight){
        this.name=name;
        this.price= new BigDecimal(price);
        this.weight = weight;
    }
    public void printProductInformation(){
        System.out.println("product name: "+name);
        System.out.println("price: "+price+"KR won");
        System.out.println("weight: "+weight+"kg");
    }
}
