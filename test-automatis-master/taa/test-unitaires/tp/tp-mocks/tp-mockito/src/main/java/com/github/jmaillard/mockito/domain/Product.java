package main.java.com.github.jmaillard.mockito.domain;

import java.math.BigDecimal;

public class Product {
	private final BigDecimal price;

	public Product(BigDecimal price) {
		this.price = price != null ? price : BigDecimal.ZERO;
	}

	public BigDecimal getPrice() throws Exception {
		return price;
	}
}
