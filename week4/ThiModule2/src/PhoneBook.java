public class PhoneBook {
    private String phoneNumber;
    private String groupPhoneNumber;
    private String name;
    private String gender;
    private String address;
    private String dayOfBirth;
    private String email;

    public PhoneBook(String phoneNumber, String groupPhoneNumber, String name, String gender, String address, String dayOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.groupPhoneNumber = groupPhoneNumber;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
    }

    public PhoneBook() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupPhoneNumber() {
        return groupPhoneNumber;
    }

    public void setGroupPhoneNumber(String groupPhoneNumber) {
        this.groupPhoneNumber = groupPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", groupPhoneNumber='" + groupPhoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
