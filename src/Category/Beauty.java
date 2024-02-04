package Category;

import Calculator.DeliveryChargeCalculator;

import java.math.BigDecimal;

public class Beauty extends Product implements DeliveryChargeCalculator {
    protected BigDecimal charge;

    Beauty() {
        super();
        charge = BigDecimal.valueOf(-1);
    }

    public Beauty(String name, int price, double weight) {
        super(name, price, weight);
        getDeliveryCharge(this.weight, this.price );
    }

    @Override
    public void getDeliveryCharge(Double weight, BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(100000)) > 0) {
            charge = new BigDecimal(0);
        } else {
            if (weight < 3D) {
                charge = new BigDecimal(3000);
            } else if (weight >= 3D && weight < 10D) {
                charge = new BigDecimal(5000);
            } else {
                charge = new BigDecimal(5000);
            }


            if (price.compareTo(BigDecimal.valueOf(30000)) > 0) {
                charge.subtract(BigDecimal.valueOf(1000));
            }
        }
    }

    public void printProductInformation(){
        System.out.println("Product type: Beauty");
        super.printProductInformation();
        System.out.println("Delivery charge: "+charge);
    }
}
