//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // Membuat objek Balok umum
            Balok balok1 = new Balok(5, 3, 2);
            System.out.println(balok1);
            System.out.println("Volume: " + balok1.hitungVolume());
            System.out.println("Luas Permukaan: " + balok1.hitungLuasPermukaan());

            // Membuat objek Balok kubus
            Balok kubus = new Balok(4);
            System.out.println(kubus);
            System.out.println("Volume: " + kubus.hitungVolume());
            System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());

            // Menghitung volume dan luas permukaan dengan metode overloading
            System.out.println("Volume balok dengan parameter: " + balok1.hitungVolume(6, 4, 3));
            System.out.println("Luas permukaan balok dengan parameter: " + balok1.hitungLuasPermukaan(6, 4, 3));
        }
    }
