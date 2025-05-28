package CaseMethod2;
public class QueueTransaksi {
    TransaksiLayanan[] data;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        data = new TransaksiLayanan[kapasitas];
        front = rear = -1;
        size = kapasitas;
    }

    public void enqueue(TransaksiLayanan t) {
        if (rear == size - 1) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        if (rear == -1) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = t;
    }

    public void tampilkanRiwayat() {
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        if (rear == -1) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (int i = front; i <= rear; i++) {
                data[i].tampilkan();
            }
        }
    }
}
