package Calculator;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {

    void getDeliveryCharge(Double weight, BigDecimal price);
}
