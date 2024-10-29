import java.util.Scanner;
public class PencariMenuKafe13 {
    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappuccino", 
            "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();
        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }

    }
}
