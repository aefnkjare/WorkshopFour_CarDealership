package com.iv;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Dealership{
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public void getVehiclesByPrice(float min, float max){
        this.inventory;

    }
    public void getVehiclesByMakeModel(String make, String model){
        this.inventory;

    }
    public void getVehiclesByYear(int min, int max){
        this.inventory;
    }
    public void getVehiclesByColor(String color){
        this.inventory;
    }
    public void getVehiclesByMileage(float min, float max){
        this.inventory;
    }
    public void getVehiclesByType(String vehicleType){
        this.inventory;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void getAllVehicles(){
        for(int i=0;i<inventory.size();i++){
            ArrayList<Vehicle>(inventory);
        }

    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);

    }
    public void removeVehicle(Vehicle vehicle){
        if (this.inventory.size() > 0) {
            Vehicle inventory = inventory.remove;
        }

    }

}
class Vehicle{
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;


    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}