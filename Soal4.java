import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Loop untuk membuat huruf bertambah tiap baris
        for (int i = 0; i < nama.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nama.charAt(j) + " ");
            }
            System.out.println(); // pindah baris
        }

        input.close();
    }
}
