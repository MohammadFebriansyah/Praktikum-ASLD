package Praktikum14;
public class Customer {
    int id;
    String name;

    public Customer(){

    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return " ID: " + this.id + " Nama: " + this.name;
    }
}
