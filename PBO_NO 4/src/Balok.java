public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Constructor untuk balok umum
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Constructor untuk kubus (semua sisi sama)
    public Balok(double sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.tinggi = sisi;
    }

    // Overloaded method untuk menghitung volume
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Overloaded method untuk menghitung volume dengan parameter
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Method untuk menghitung luas permukaan
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Overloaded method untuk menghitung luas permukaan dengan parameter
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public String toString() {
        return "Balok[Panjang=" + panjang + ", Lebar=" + lebar + ", Tinggi=" + tinggi + "]";
    }
}
