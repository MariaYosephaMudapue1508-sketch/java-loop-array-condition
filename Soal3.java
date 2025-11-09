import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan beberapa angka (pisahkan dengan spasi): ");
        String data = input.nextLine(); // baca satu baris input

        String[] angkaStr = data.split(" "); // pisahkan berdasarkan spasi
        int[] angka = new int[angkaStr.length];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < angkaStr.length; i++) {
            angka[i] = Integer.parseInt(angkaStr[i]);
            sum += angka[i];

            if (angka[i] > max) max = angka[i];
            if (angka[i] < min) min = angka[i];
        }

        double avg = (double) sum / angka.length;

        System.out.println("Largest Number : " + max);
        System.out.println("Lowest Number  : " + min);
        System.out.println("Sum of Total   : " + sum);
        System.out.println("Average Value  : " + avg);

        input.close();
    }
}
