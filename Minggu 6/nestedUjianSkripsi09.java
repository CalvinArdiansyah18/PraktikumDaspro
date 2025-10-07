import java.util.Scanner;
public class nestedUjianSkripsi09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.next().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbingan1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbingan2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbingan1 >= 8 && bimbingan2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbingan1 < 8 && bimbingan2 < 4) {
                pesan = "Gagal: Log bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali.";
            } else if (bimbingan1 < 8) {
                pesan = "Gagal: Log bimbingan P1 belum mencapai 8 kali.";
            } else {
                pesan = "Gagal: Log bimbingan P2 belum mencapai 4 kali.";
            }
            
        }else {
            pesan = "Gagal: Mahasiswa masih memiliki tanggungan kompen.";
        }
        System.out.println(pesan);
        sc.close();
    }
}