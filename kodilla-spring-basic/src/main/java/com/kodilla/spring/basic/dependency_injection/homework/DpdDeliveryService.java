package com.kodilla.spring.basic.dependency_injection.homework;

public class DpdDeliveryService implements DeliveryService, NotificationService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 50) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }
    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
