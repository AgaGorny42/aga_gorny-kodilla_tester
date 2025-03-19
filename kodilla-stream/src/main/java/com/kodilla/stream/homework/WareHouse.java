package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WareHouse {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        return orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().orElseThrow(() -> new OrderDoesntExistException());


//                .collect(Collectors.toList());

//        if (list.size() == 0){
//            throw new OrderDoesntExistException();
//        }else {
//            return list.get(0);
//        }
    }
}
