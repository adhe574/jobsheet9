import java.util.Scanner;

public class TugasNilai01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);

        int[] nilaiMhs = new int[5];
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc01.nextInt();

        for (int i=0; i<5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc01.nextInt();                   
        }

        double rata2 = hitungRata2/jumlahMahasiswa;
        double jumlahNilai = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
    
        System.out.println("\nNilai Mahasiswa : ");
        for (int i=0; i<5; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " : " + nilaiMhs[i]);
        }

        System.out.println("\nNilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Rata-rata nilai : " + rata2);

        sc01.close();
    }
}