package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void hawaiiPizzGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new PineappleDecorator(order);
        order = new HamDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then
        assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void hawaiiPizzaGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new PineappleDecorator(order);
        order = new HamDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Pizza pastry with tomato sauce and cheese + pineapple + ham", description);
    }

    @Test
    public void capriciosaPizzaGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MushroomDecorator(order);
        order = new HamDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then
        assertEquals(new BigDecimal(22), cost);
    }

    @Test
    public void capriciosaPizzaGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MushroomDecorator(order);
        order = new HamDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Pizza pastry with tomato sauce and cheese + mushrooms + ham", description);
    }

    @Test
    public void chefPizzaGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MushroomDecorator(order);
        order = new HamDecorator(order);
        order = new SalamiDecorator(order);
        order = new PaprikaDecorator(order);
        order = new TomatoDecorator(order);
        order = new OnionDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then
        assertEquals(new BigDecimal(33), cost);
    }

    @Test
    public void chefPizzaGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MushroomDecorator(order);
        order = new HamDecorator(order);
        order = new SalamiDecorator(order);
        order = new PaprikaDecorator(order);
        order = new TomatoDecorator(order);
        order = new OnionDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Pizza pastry with tomato sauce and cheese + mushrooms + ham + salami + paprika + tomato + onion", description);
    }
}
