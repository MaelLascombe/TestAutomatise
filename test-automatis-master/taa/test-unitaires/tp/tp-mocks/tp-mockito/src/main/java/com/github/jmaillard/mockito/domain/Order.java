package main.java.com.github.jmaillard.mockito.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class Order {

    List<Product> products;

    public Order(List<Product> products) {
        this.products = products != null ? products : new ArrayList<Product>();
    }
 
    public BigDecimal getTotalPrice() throws Exception {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : products) {
            total = total.add(product.getPrice());
        }
        return total;
    }
 
    public String formatTotalPrice(Locale locale) {
        try {
            return NumberFormat.getCurrencyInstance(locale).format(getTotalPrice());
        } catch (Exception e) {
            return StringUtils.EMPTY;
        }
    }
}