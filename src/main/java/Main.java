import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static final int MINSPEED = 0;
    public static final int MAXSPEED = 250;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Car> cars = new HashSet<>();

        for (int i = 1; i <= 3; i++) {
            String nameCar;
            int speedCar;

            System.out.println("— Введите название машины №" + i + ":  ");
            nameCar = scanner.next();

            while (true) {
                System.out.println("— Введите скорость машины №" + i +":  ");
                if (scanner.hasNextInt()) {
                    speedCar = scanner.nextInt();
                    if (speedCar > MINSPEED && speedCar <= MAXSPEED) {
                        break;
                    }
                    System.out.println("Недопустимая скорость машины. Повторите ввод!");
                } else {
                    System.out.println("Недопустимая скорость машины. Повторите ввод!");
                    scanner.next();
                }

            }
            Car car = new Car(nameCar, speedCar);
            cars.add(car);
        }

        Race race = new Race();
        System.out.println("Самая быстрая машина: " + race.startRace(cars));
    }
}