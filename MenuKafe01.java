import java.util.Scanner;
public class MenuKafe01 {
    public static void main(String[] args) {

        Scanner sc01 = new Scanner(System.in);
        
        String[] menu = {"Kentang goreng", "Nasi goreng", "Thai tea", "Cappucino"};

        System.out.print("Masukkan nama makanan yang ingin dicari : ");
        String makananDicari = sc01.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase((makananDicari))) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan/minuman " + makananDicari + " tersedia di menu ");
        } else {
            System.out.println("Makanan/minuman " + makananDicari + " tidak tersedia di menu");
        }
    }    
}
