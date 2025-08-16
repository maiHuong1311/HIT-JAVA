import java.util.Scanner;
public class Publisher {
    private String name;
    private String address;

    public Publisher() {}
    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.print("\nNhà sản xuất: " + this.name + "\nĐịa chỉ: " + this.address + "\n");
    }
}
