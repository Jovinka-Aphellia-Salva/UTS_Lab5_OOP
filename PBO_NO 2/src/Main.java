//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(AnagramChecker.isAnagram(str1, str2)); // true

        str1 = "hello";
        str2 = "world";
        System.out.println(AnagramChecker.isAnagram(str1, str2)); // false
    }
}

