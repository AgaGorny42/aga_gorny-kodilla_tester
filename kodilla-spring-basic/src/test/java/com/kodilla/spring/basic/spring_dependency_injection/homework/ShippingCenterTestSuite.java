package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    NotificationService notificationService = context.getBean(NotificationService.class);
    ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
    DeliveryService dpddeliveryService = context.getBean(DpdDeliveryService.class);
    DeliveryService gpsdeliveryService = context.getBean(GpsDeliveryService.class);

    @Test
    public void sendPackageTest() {
        String message = shippingCenter.sendPackage("Old Street 40, New York", 51);
        Assertions.assertEquals("Package not delivered to: Old Street 40, New York", message);
    }

    @Test
    public void failTest() {
        String message = notificationService.fail("Test address");
        Assertions.assertEquals("Package not delivered to: Test address", message);
    }

    @Test
    public void successTest() {
        String message = notificationService.success("Test address");
        Assertions.assertEquals("Package delivered to: Test address", message);
    }

    @Test
    public void deliverPackageDpdTest() {
        boolean message = dpddeliveryService.deliverPackage("Test address", 31);
        Assertions.assertTrue(message);
    }

    @Test
    public void deliverPackageGpsTest() {
        boolean message = gpsdeliveryService.deliverPackage("Test address", 31);
        Assertions.assertFalse(message);
    }
}
