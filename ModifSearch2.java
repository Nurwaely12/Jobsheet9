import java.util.Scanner;

public class ModifSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int n = sc.nextInt();
        
        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        
        for (int j = 0; j < 2; j++) { 
            System.out.print("Masukkan nilai yang ingin dicari: ");
            int key = sc.nextInt();
            boolean found = false; 
            

            for (int i = 0; i < arrNilai.length; i++) {
                if (key == arrNilai[i]) {
                    System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                    found = true; 
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
            }
        }

        sc.close(); 
    }
}


