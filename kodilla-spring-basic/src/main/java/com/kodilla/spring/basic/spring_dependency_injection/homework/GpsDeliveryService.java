package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class GpsDeliveryService implements DeliveryService, NotificationService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
    @Override
    public String success(String address) {
        return "Package delivered to: " + address;
    }
    @Override
    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
