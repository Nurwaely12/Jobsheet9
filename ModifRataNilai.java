import java.util.Scanner;

public class ModifRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa]; 
        double total = 0;
        double totalTidakLulus = 0; 
        int jumlahLulus = 0; 
        int jumlahTidakLulus = 0; 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) { 
                jumlahLulus++;
            } else { 
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i]; 
            }
        }
        double rata2 = total / nilaiMhs.length;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (totalTidakLulus / jumlahTidakLulus) : 0;

        System.out.printf("Rata-rata nilai = %.1f\n", rata2);
        System.out.printf("Rata-rata nilai mahasiswa yang tidak lulus = %.1f\n", rataTidakLulus);

        sc.close(); 
    }
}

