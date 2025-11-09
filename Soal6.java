import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        String balik = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            balik += kata.charAt(i);
        }

        if (kata.equalsIgnoreCase(balik)) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }

        input.close();
    }
}
