package com.kodilla.stream.homework;

public class WareHouseApp {
    public static void main(String[] args) {

        WareHouse wareHouse = new WareHouse();

        wareHouse.addOrder(new Order("976"));
        wareHouse.addOrder(new Order("789"));
        wareHouse.addOrder(new Order("986"));
        wareHouse.addOrder(new Order("765"));
        wareHouse.addOrder(new Order("569"));
        wareHouse.addOrder(new Order("097"));
        wareHouse.addOrder(new Order("540"));

        String orderNumber = "888";
        try {
            wareHouse.getOrder(orderNumber);
        } catch (OrderDoesntExistException e) {
            System.out.println("The order number: " + orderNumber + " does not exist.");
            System.out.println("Please enter a new order number.");
        }
    }
}

