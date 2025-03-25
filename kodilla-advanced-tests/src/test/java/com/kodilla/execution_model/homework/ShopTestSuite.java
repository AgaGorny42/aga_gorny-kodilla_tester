package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order customer1 = new Order(560.00, LocalDate.of(2024, 12, 01), "customer1");
    Order customer2 = new Order(760.00, LocalDate.of(2024, 12, 10), "customer2");
    Order customer3 = new Order(400.00, LocalDate.of(2024, 12, 12), "customer3");
    Order customer4 = new Order(300.00, LocalDate.of(2024, 12, 20), "customer4");

    Set<Order> orders = new HashSet<>();

    @Test
    public void ShouldAddOrderToList() {

        orders = shop.getOrdersFromRangeOfValues(300, 300);
        assertEquals(1, orders.size());
    }

    @Test
    public void getOrdersFromRangeOfDatesTest() {

        LocalDate startDate = LocalDate.of(2024, 12, 01);
        LocalDate endDate = LocalDate.of(2024, 12, 20);

        boolean orders0 = shop.getOrdersFromRangeOfDates(startDate, endDate).contains(customer1);
        boolean orders1 = shop.getOrdersFromRangeOfDates(startDate, endDate).contains(customer4);
        boolean orders2 = shop.getOrdersFromRangeOfDates(startDate, endDate).contains(customer2);

        assertFalse(orders0);
        assertFalse(orders1);
        assertTrue(orders2);

        assertEquals(2, shop.getOrdersFromRangeOfDates(startDate, endDate).size());
    }
    @Test
    public void getOrdersFromRangeOfValuesTest() {
        double minimumValue = 301;
        double maximunValue = 759;
        boolean order1 = shop.getOrdersFromRangeOfValues(minimumValue, maximunValue).contains(customer1);
        boolean order2 = shop.getOrdersFromRangeOfValues(minimumValue,maximunValue).contains(customer4);

        assertEquals(2, shop.getOrdersFromRangeOfValues(minimumValue, maximunValue).size());
        assertTrue(order1);
        assertFalse(order2);
    }
    @Test
    public void sumOfOrdersValueTest() {

        assertEquals(2020, shop.sumOfOrdersValue());
    }

    @Test
    public void returnOrdersSizeTest() {

        int sizeOfList = shop.returnOrdersSize();
        assertEquals(4, sizeOfList);

    }

    @BeforeEach
    public void initializeOrders() {

        shop.addOrder(customer1);
        shop.addOrder(customer2);
        shop.addOrder(customer3);
        shop.addOrder(customer4);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}