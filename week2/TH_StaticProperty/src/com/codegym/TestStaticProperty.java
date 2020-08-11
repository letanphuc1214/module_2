package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args){
        Car car1 = new Car("matza", "skyactiv3");
        System.out.print(Car.numberOfCars + " ");
        car1.display();
        Car car2 = new Car("lamborghini", "skyactiv4");
        System.out.print(Car.numberOfCars+ " ");
        car2.display();
        Car car3 = new Car("mercedes", "skyactiv5");
        System.out.print(Car.numberOfCars+ " ");
        car3.display();
        Car car4 = new Car("chevrolet", "skyactiv6");
        System.out.print(Car.numberOfCars+ " ");
        car4.display();



    }
}
