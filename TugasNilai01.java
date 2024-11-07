import java.util.Scanner;

public class TugasNilai01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);

        int[] nilaiMhs = new int [5];
        double nilai = 0, tertinggi = 0, terendah = 0, rata2;
        
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int N = sc01.nextInt();

        for (int i=1; i<5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc01.nextInt();                   
        }

        rata2 = nilai/4;
        nilai += nilaiMhs[4];
        System.out.println("Rata-rata nilai : " + rata2);

    }
}