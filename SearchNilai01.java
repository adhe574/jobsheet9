import java.util.Scanner;

public class SearchNilai01 {
    public static void main(String[] args) {

        Scanner sc01 = new Scanner(System.in);
        
        int[] arrNilai = new int[7];
        int key = 0;
        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int N = sc01.nextInt();

        for (int i=1; i<7; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            arrNilai[i] = sc01.nextInt();
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        arrNilai[N] = sc01.nextInt();
        System.out.println();
        System.out.println("Nilai "+ hasil +" ketemu, merupakan nilai mahasiswa ke-" + hasil);
    }
}
