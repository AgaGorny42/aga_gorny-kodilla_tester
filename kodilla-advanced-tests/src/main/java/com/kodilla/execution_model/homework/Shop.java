package com.kodilla.execution_model.homework;

import java.time.LocalDate;

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Set<Order> getOrdersFromRangeOfDates (LocalDate startDate, LocalDate endDate) {
        Set<Order> newList= orders
                .stream()
                .filter(order -> (order.getDate().isAfter(startDate) &&  order.getDate().isBefore(endDate)) )
                        .collect(Collectors.toSet());
        return newList;
    }

    public Set<Order> getOrdersFromRangeOfValues(double minimumValue, double maximumValue) {
        Set<Order> list = orders.stream()
                .filter(value -> value.getValue() >= minimumValue && value.getValue() <= maximumValue)
                .collect(Collectors.toSet());
        return list;
    }

    public int returnOrdersSize() {
        return orders.size();
    }

    public double sumOfOrdersValue() {
        Double sum = orders.stream()
                .mapToDouble(Order::getValue)
                .sum();

        return sum;
    }
}
