import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerBarang = 20000; // misal harga tiap barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();

        double total = hargaPerBarang * jumlah;
        double diskon = 0;

        // Jika beli lebih dari 10 barang, dapat diskon 10%
        if (jumlah > 10) {
            diskon = total * 0.10;
        }

        double totalAkhir = total - diskon;

        System.out.println("Harga per barang : " + hargaPerBarang);
        System.out.println("Jumlah barang    : " + jumlah);
        System.out.println("Total sebelum diskon : " + total);
        System.out.println("Diskon               : " + diskon);
        System.out.println("Total bayar akhir    : " + totalAkhir);

        input.close();
    }
}
