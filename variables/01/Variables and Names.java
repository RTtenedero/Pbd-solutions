public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInCar, carpoolCapacity, averagePassengersPerCar;
        //This is to assign the value of the amount of cars
        cars = 200;
        //This assigns the value of the space in the car in floating point number
        spaceInCar = 5.0;
        //This assigns to drivers how much drivers are available
        drivers = 20;
        //This assigns the number of passengers to passengers
        passengers = 80;
        //This assigns the number of cars not driven by subtracting cars and drivers
        carsNotDriven = cars - drivers;
        //This assigns the number of cars driven by the number of drivers.
        carsDriven = drivers;
        //This means that carsDriven multiplied by space in car
        carpoolCapacity = carsDriven * spaceInCar;
        //This means number of passenhgers divided by Cars Driven       
        averagePassengersPerCar = passengers / carsDriven;


        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
1. When it is 4 it just automatically changes to 4.0. It is necessary so that it can be specific on a number.
2. A floating point number is a number that is not whole.
    3. see slashes
    4.= is the assignment operator that assigns the variable to the string name for value.
