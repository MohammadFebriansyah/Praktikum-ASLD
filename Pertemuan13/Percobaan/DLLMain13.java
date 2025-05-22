package Pertemuan13.Percobaan;
import java.util.Scanner;

public class DLLMain13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedLists13 list = new DoubleLinkedLists13();
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data setelah NIM tertentu");
            System.out.println("8. Tambahkan data pada indeks tertentu.");
            System.out.println("9. Hapus data setelah data tertentu.");
            System.out.println("10. Hapus data pada indeks tertentu.");
            System.out.println("11. Tampilkan data pertama.");
            System.out.println("12. Tampilkan data terakhir.");
            System.out.println("13. Tampilkan data berdasarkan indeks.");
            System.out.println("14. Tampilkan jumlah data.");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.println("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node13 found = list.search(nim);
                    if (found != null){
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.println("Masukkan NIM setelah data ini ditambahkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan indeks untuk menambahkan data: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan data yang digunakan untuk acuan: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks data yang ingin dihapus: ");
                    int index = scan.nextInt();
                    list.remove(index);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt();
                    list.getIndex(idx);
                }
                case 14 -> System.out.println("Jumlah data: " + list.size());
                case 0 -> System.out.println("keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
        public static Mahasiswa13 inputMahasiswa13(Scanner scan) {
            System.out.print("Masukkan NIM: ");
            String nim = scan.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scan.nextLine();

            System.out.print("Masukkan Kelas: ");
            String kelas = scan.nextLine();

            System.out.print("Masukkan IPK: ");
            double ipk = scan.nextDouble();
            scan.nextLine();

            return new Mahasiswa13(nim, nama, kelas, ipk);
        }
}
