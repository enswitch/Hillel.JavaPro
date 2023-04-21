package homeworks.hm3;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Turn on the electricity");
    }

    private void startCommand() {
        System.out.println("Turn on the command");
    }

    private void startFuelSystem() {
        System.out.println("Turn on the fuel system");
    }
}

