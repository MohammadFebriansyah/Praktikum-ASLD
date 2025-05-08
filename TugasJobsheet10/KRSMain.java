package TugasJobsheet10;
import java.util.Scanner;
public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Paling Belakang");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah Sudah KRS");
            System.out.println("8. Cek Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh!");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
                case 5:
                    antrian.tampilkanBelakang();
                    break;
                case 6:
                    antrian.getJumlahAntrian();
                    break;
                case 7:
                    antrian.getJumlahProses();
                    break;
                case 8:
                    antrian.getBelumProses();
                    break;
                case 9:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
