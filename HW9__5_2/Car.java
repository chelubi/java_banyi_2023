/**
 * Бані, компмех, завдання 5.2, лаба 4
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.Arrays;

public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brand, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
    }

    public void refuel() {

    }

    public void changeWheel(int wheelIndex, Wheel newWheel) {
        if (wheelIndex >= 0 && wheelIndex < wheels.length) {
            wheels[wheelIndex] = newWheel;
        }
    }

    public void printBrand() {
        System.out.println("Марка автомобіля: " + brand);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return brand.equals(car.brand) && engine.equals(car.engine) && Arrays.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + engine.hashCode();
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
