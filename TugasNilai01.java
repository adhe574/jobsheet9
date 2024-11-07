import java.util.Scanner;

public class TugasNilai01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        int jumlahNilaiMahasiswa = sc01.nextInt();

        int[] nilaiMhs = new int[jumlahNilaiMahasiswa];

        for (int i=0; i<jumlahNilaiMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc01.nextInt();
        }

        double rata2 = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0]; 

        for (int i=0; i<jumlahNilaiMahasiswa; i++) {
            rata2 += nilaiMhs [i]; 
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        rata2 /= jumlahNilaiMahasiswa;

        System.out.println("\nNilai Mahasiswa : ");
        for (int j=0; j<nilaiMhs.length; j++) {
            System.out.println("Nilai mahasiswa ke-" + (j+1) + " : " + nilaiMhs[j]);
        }
        System.out.println();
        System.out.println("Nilai rata-rata : " + rata2);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);

    }
}