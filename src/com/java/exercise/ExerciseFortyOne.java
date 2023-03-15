
package com.java.exercise;

public class ExerciseFortyOne {

    public static void main(String[] args) {
        Cars fiesta = new Cars("Ford", "Fiesta", "1978", 750);
        Cars bmwZ4 = new Cars("BMW", "BMW - Z4", "2023", 750);
        Cars bmwZ8 = new Cars("BMW", "BMW - Z8", "2000", 750);

        Cars[] cars = {fiesta, bmwZ4, bmwZ8};

        for (Cars car : cars) {
            System.out.println();
            System.out.println("--------------------------" + car.getMake() + "--------------------------");
            System.out.println("=========================================================================");
            car.displayInfo();
            System.out.println();

            System.out.println("Start Driving.....");
            car.drive();

            System.out.println("Stop Driving.....");
            car.stop();

            System.out.println("=========================================================================");
            car.displayInfo();

            System.out.println();
            System.out.println("Star Driving 100+ time.......");
            for (int i = 0; i < 150; i++) {
                car.drive();
                car.stop();
            }

            System.out.println("=========================================================================");
            car.displayInfo();

            System.out.println();
            System.out.println("Repairing.......");
            car.repair();

            System.out.println("=========================================================================");
            car.displayInfo();

        }
    }

}

class Vehicle {
    public Vehicle(String make, String model, String year, float weight) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    String make;
    String model;
    String year;
    float weight;

    boolean needsMaintenance = false;
    int tripsSinceMaintenance = 0;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isNeedsMaintenance() {
        return needsMaintenance;
    }

    public int getTripsSinceMaintenance() {
        return tripsSinceMaintenance;
    }

    public void displayInfo() {
        System.out.println("Make                    : " + this.getModel());
        System.out.println("Model                   : " + this.getMake());
        System.out.println("Year                    : " + this.getYear());
        System.out.println("Weight                  : " + this.getWeight());
        System.out.println("Need Maintenance        : " + this.isNeedsMaintenance());
        System.out.println("Trips Since Maintenance : " + this.getTripsSinceMaintenance());
    }

}

class Cars extends Vehicle {

    boolean isDriving = false;

    public Cars(String make, String model, String year, float weight) {
        super(make, model, year, weight);
    }

    public void drive() {
        this.isDriving = !isDriving;
    }

    public void stop() {
        this.isDriving = !this.isDriving;
        this.tripsSinceMaintenance += 1;
        if (this.tripsSinceMaintenance == 100) {
            this.needsMaintenance = !this.needsMaintenance;
        }
    }

    public void repair() {
        this.tripsSinceMaintenance = 0;
        this.needsMaintenance = false;
    }

}


