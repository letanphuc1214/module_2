import java.util.Scanner;

public class Customer {
    private String customerName;
    private String address;
    private String email;
    private String phoneNumber;
    private String gender;
    private int purcharseOrder;

    public Customer() {
    };

    public Customer(String customerName, String address, String email, String phoneNumber, String gender, int purcharseOrder) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.purcharseOrder = purcharseOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPurcharseOrder() {
        return purcharseOrder;
    }

    public void setPurcharseOrder(int purcharseOrder) {
        this.purcharseOrder = purcharseOrder;
    }

    @Override
    public String toString() {
        return
                "customerName = " + customerName +
                        ", address = " + address +
                        ", email = " + email +
                        ", phoneNumber = " + phoneNumber +
                        ", gender = " + gender
                ;
    }
}
