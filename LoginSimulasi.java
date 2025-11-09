import java.util.ArrayList;
import java.util.Scanner;

public class LoginSimulasi {
    public static void main(String[] args) {
        
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        usernames.add("aira");
        passwords.add("12345");

        usernames.add("budi");
        passwords.add("abcd");

        usernames.add("citra");
        passwords.add("pass123");

        usernames.add("doni");
        passwords.add("qwerty");

        usernames.add("ella");
        passwords.add("hello");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pengguna: ");
        String namaInput = input.nextLine();

        System.out.print("Masukkan kata sandi: ");
        String sandiInput = input.nextLine();

        boolean loginBerhasil = false;

        for (int i = 0; i < usernames.size(); i++) {
            if (namaInput.equals(usernames.get(i)) && sandiInput.equals(passwords.get(i))) {
                loginBerhasil = true;
                break;
            }
        }

        if (loginBerhasil) {
            System.out.println("Nama pengguna dan kata sandi valid, Anda dapat masuk ke dasbor.");
        } else {
            System.out.println("Nama pengguna dan kata sandi salah.");
        }

        input.close();
    }
}
