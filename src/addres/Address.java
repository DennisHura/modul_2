package addres;

public class Address {

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Address(){

    }

    public Address(String address){
        this.address = address;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(" Address: " + this.address);
        return string.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }
}
