package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryService = new GpsDeliveryService();
        NotificationService notificationService = new GpsDeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.sendPackage("Old Street 2, New Jersey", 51.0);
    }
}
