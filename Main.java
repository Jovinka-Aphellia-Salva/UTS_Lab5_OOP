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

// Class untuk Garage (garasi)
class Garage {
    private ArrayList<Car> cars;

    // Constructor
    public Garage() {
        this.cars = new ArrayList<>();
    }

    // Method Overloading: menambahkan mobil ke dalam garage
    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void addCar(String brand, String model, int year) {
        this.cars.add(new Car(brand, model, year));
    }

    // Method untuk menampilkan semua mobil dalam garage
    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

// Class untuk Car (mobil)
class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method getter dan setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method Overriding: mengoverride method toString untuk menampilkan informasi mobil
    @Override
    public String toString() {
        return "Mobil: " + brand + " " + model + ", Tahun: " + year;
    }
}
