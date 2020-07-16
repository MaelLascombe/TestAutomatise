package main.java.com.github.jmaillard.mockito.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class OrderTest {

	@Test
	public void I_Should_Get_8_99_When_I_Add_3_99_And_5() throws Exception {
		
		Product product1 = Mockito.mock(Product.class);
		Product product2 = Mockito.mock(Product.class);

		Mockito.when(product1.getPrice()).thenReturn(new BigDecimal("3.99"));
		Mockito.when(product2.getPrice()).thenReturn(new BigDecimal("5"));
		
		Order order = Mockito.spy(new Order(null));
		order.products.add(product1);
		order.products.add(product2);

		
		Assert.assertEquals(new BigDecimal("8.99"), order.getTotalPrice());
		
	}

}
