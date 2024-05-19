import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        // Menghapus spasi dan mengonversi menjadi huruf kecil
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Mengecek panjang string
        if (str1.length() != str2.length()) {
            return false;
        }

        
}
