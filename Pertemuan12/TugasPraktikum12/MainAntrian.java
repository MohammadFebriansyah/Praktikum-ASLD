package TugasPraktikum12;
import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianMahasiswa antrian = new AntrianMahasiswa(10); // kapasitas 10

        int pilih;
        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan dan Terakhir");
            System.out.println("5. Tampilkan Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.tampilDepanBelakang();
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
