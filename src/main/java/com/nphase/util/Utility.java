package com.nphase.util;

import java.math.BigDecimal;

/**
 * @author abul
 */
public class Utility {
    /**
     * Calculate discount based on amount given
     *
     * @param discount
     * @param amount
     * @return
     */
    public static BigDecimal applyDiscount(BigDecimal discount, BigDecimal amount) {
        return (amount.multiply(discount)).divide(BigDecimal.valueOf(100));
    }

    public static BigDecimal calculateTotalPriceOfProducts(BigDecimal price, int quantity) {
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
