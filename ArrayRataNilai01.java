import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa= sc01.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double total = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;

        for (int i=0; i<jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc01.nextInt();

            if (nilaiMhs[i]>=70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        double rata2Lulus = jumlahLulus == 0 ? 0 : totalLulus / jumlahLulus;
        double rata2TidakLulus = jumlahTidakLulus == 0 ? 0 : totalTidakLulus / jumlahTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}