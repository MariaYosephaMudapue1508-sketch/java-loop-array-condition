public class no2 {
    public static void main(String[] args) {
        int rows = 3; // jumlah baris
        int columns =8; // jumlah karakter per baris
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Jika baris genap, mulai dengan 'A', jika ganjil mulai dengan 'B'
                if ((i + j) % 2 == 0) {
                    System.out.print("A");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println(); 
        }
        System.out.println();
        
        for (int i = 1; i <= 6; i++) {         // baris
            for (int j = 1; j <= 6; j++) {     // kolom
                if (j <= i) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println(); // pindah baris
        }
    }
}
