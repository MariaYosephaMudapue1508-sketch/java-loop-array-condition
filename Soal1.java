public class no1 {
    public static void main(String[] args) {
        int a = 6; 
        int c = 4;
        System.out.print(a);
        
        for (int b = 1; b < 9; b++) {
            System.out.print(" ");
      
            if (b % 2 != 0) { 
                a = a - c; 
            } else {
                a = a + c; 
            }
            
            System.out.print(a);

            c++;
        }
        System.out.println(); 
    }
}
