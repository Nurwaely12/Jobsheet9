import java.util.ArrayList;
import java.util.Scanner;

public class NilaiMahasiswa13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

       
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            nilaiMahasiswa.add(nilai);
        }
        double rataRata = hitungRataRata(nilaiMahasiswa);
        System.out.println("Nilai rata-rata: " + rataRata);
      
        int nilaiTertinggi = nilaiMahasiswa.get(0);
        int nilaiTerendah = nilaiMahasiswa.get(0);

        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Semua nilai yang dimasukkan: " + nilaiMahasiswa);
    }

    private static double hitungRataRata(ArrayList<Integer> nilaiMahasiswa) {
        double total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        return total / nilaiMahasiswa.size();
    }
}
