package com.iv;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    @Test
    void getAllVehicles_should_returnAllVehicles() {
        // Arrange
        Dealership dealership = new Dealership("", "", "");

        Vehicle vehicle1 = new Vehicle(128774813,2001, "Honda", "Accord", "car", "White", 201_715, 2084.192753748);
        Vehicle vehicle2 = new Vehicle(7848291,2018, "Power", "Vacuum", "truck", "transparent", 159_989, 193488.88);
        Vehicle vehicle3 = new Vehicle(908427,2029, "lgiaa", "pqoiejr", "flying car", "none", 0, 1);

        ArrayList<Vehicle> expected = new ArrayList<>();

        expected.add(vehicle1);
        expected.add(vehicle2);
        expected.add(vehicle3);

        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);
        dealership.addVehicle(vehicle3);

        // Act
        ArrayList<Vehicle> actual = dealership.getAllVehicles();

        // Assert

        assertEquals(expected, actual);

    }
}