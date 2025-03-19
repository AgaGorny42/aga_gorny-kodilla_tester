package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WareHouseTestSuite {

    @Test
    public void getOrderTest () throws OrderDoesntExistException {
        //given
        Order order = new Order("999");
        WareHouse wareHouse = new WareHouse();
        wareHouse.addOrder(order);
        //when
        String number1 = order.getNumber();
        //then
        assertEquals("999", wareHouse.getOrder(number1).getNumber());
    }
    @Test
    public void testGetOrder_withException() {
        //given
        WareHouse wareHouse = new WareHouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> wareHouse.getOrder("888"));
    }
}