import java.util.ArrayList;
import java.util.Scanner;

// Class utama
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();

        // Menambahkan beberapa mobil ke dalam garage
        garage.addCar(new Car("Toyota", "Camry", 2020));
        garage.addCar(new Car("Honda", "Civic", 2018));

        System.out.println("Selamat datang di manajemen mobil!");
        System.out.println("Mobil yang tersedia:");
        garage.displayCars();

        // Menambahkan mobil baru melalui input user
        System.out.println("Masukkan merek mobil baru: ");
        String brand = scanner.nextLine();
        System.out.println("Masukkan model mobil baru: ");
        String model = scanner.nextLine();
        System.out.println("Masukkan tahun mobil baru: ");
        int year = scanner.nextInt();

        garage.addCar(new Car(brand, model, year));

        System.out.println("Daftar mobil terbaru:");
        garage.displayCars();

        scanner.close();
    }
}

