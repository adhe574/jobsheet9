import java.util.Scanner;
public class TugasKafe01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        String[] namaPesanan = {"Kopi", "Teh", "Nasi goreng", "Rice bowl"};
        double[] hargaPesanan = new double[4];
        double totalBiaya = 0;
        int jmlPesanan;

        System.out.print("Jumlah pesanan : ");
        jmlPesanan = sc01.nextInt();
        sc01.nextLine();

        for (int i=0; i<jmlPesanan; i++ ) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1) + " : ");
            namaPesanan[i] = sc01.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i+1) + " : ");
            hargaPesanan[i] = sc01.nextDouble();
            sc01.nextLine();

            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nDaftar pesanan : ");
        for (int i=0; i<jmlPesanan; i++) {
            System.out.println((namaPesanan[i]) + " -harga : " + hargaPesanan[i]);
        }

        System.out.println("Total Biaya : Rp " + totalBiaya);

    }
}
