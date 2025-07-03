import java.util.HashSet;
import java.util.Scanner;

public class Main {
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
                speedCar = scanner.nextInt();
                if (speedCar > 0 && speedCar <= 250) {
                    break;
                }
                System.out.println("Недопустимая скорость машины. Повторите ввод!");
            }
            Car car = new Car(nameCar, speedCar);
            cars.add(car);
        }

        Race race = new Race();
        System.out.println("Самая быстрая машина: " + race.startRace(cars));
    }
}