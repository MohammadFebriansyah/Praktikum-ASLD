public class StackTugasMahasiswa13 {
    Mahasiswa13[] stack;
    int size;
    int top;

    public StackTugasMahasiswa13(int size) {
        this.size = size;
        stack = new Mahasiswa13[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Mahasiswa13 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa13 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa13 peek() {
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
            for (int i = 0; i <= top; i++){
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\tNilai: " + (stack[i].nilai >=0 ? stack[i].nilai : "Belum dinilai"));
            }
            System.out.println();
    }

    public Mahasiswa13 lihatTugasTerbawah13 (){
        if (!isEmpty()){
            return stack[0];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public int jumlahTugasTerkumpul13(){
        return top + 1;
    }
}
