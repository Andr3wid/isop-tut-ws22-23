public class Car extends Vehicle implements ElectricCar {
    String model;
    int currentSpeed;

    public Car(String model, int currentSpeed) {
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        if(speed < 0) {
            throw new IllegalArgumentException("No negative speeds allowed");
        }
        this.currentSpeed = speed;
    }

    public void printCarInfos() {
        System.out.println("Model: " + this.model + " | Current speed: " + this.currentSpeed);
    }

    @Override
    public void recharge(int amount) {

    }

    @Override
    public void useElectricity() {

    }

    @Override
    public void crash() {
        System.out.println("Our car just crashed");
    }


}
