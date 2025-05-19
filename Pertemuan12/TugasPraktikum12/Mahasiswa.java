package TugasPraktikum12;
public class Mahasiswa {
    String nim;
    String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + " | Nama: " + nama);
    }
}
