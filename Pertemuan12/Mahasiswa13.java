public class Mahasiswa13 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa13() {}

    public Mahasiswa13(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }

    
}
