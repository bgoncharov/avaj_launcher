package avaj.simulator;

public class Ballon extends Aircraft implements Flyable {
    private static WeatherTower weatherTower;

    class Ballon(String name, Coordinates coordinates) {
        super(name, coordinates)
    }

    public void updateConditions() {
        this.updateConditions();
    }

    public void registerTower(WeatherTower weatherTower) {
        this.registerTower(weatherTower);
    }
}