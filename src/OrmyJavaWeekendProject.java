import java.util.Scanner;

import Calculator.DeliveryChargeCalculator;
import Category.*;

public class OrmyJavaWeekendProject{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        Product product = null;
        String name;
        int price;
        double weight;

        System.out.println("select product type.");
        while(true) {
            System.out.println("1.beauty 2. grocery 3.large appliance");
            num = scanner.nextInt();

            if(num>=1 && num <=3)
                break;

            System.out.println("wrong input! please type correctly");
        }

        scanner.nextLine();

        System.out.print("type name of product: ");
        name = scanner.nextLine();

        System.out.print("type price of product: ");
        price = scanner.nextInt();

        scanner.nextLine();

        System.out.print("type weight of product: ");
        weight = scanner.nextDouble();

        switch (num) {
            case 1 -> product = new Beauty(name, price, weight);
            case 2 -> product = new Grocery(name, price, weight);
            case 3 -> product = new LargeAppliance(name, price, weight);
        }

        product.printProductInformation();

        scanner.close();
    }
}