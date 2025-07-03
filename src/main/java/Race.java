import java.util.HashSet;

public class Race {
    String leader;

    public String startRace(HashSet<Car> cars) {
        int maxDistantce = 0;

        for (Car car : cars) {
            int distance = 24 * car.speed;
            if (distance > maxDistantce) {
                maxDistantce = distance;
                this.leader = car.name;
            }
        }

        return leader;
    }
}
