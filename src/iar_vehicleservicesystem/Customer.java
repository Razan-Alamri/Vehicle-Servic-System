package iar_vehicleservicesystem;

// Razan Arif Mohammed Alamri, xx, IAR, Vehicle Service System , 17-4-2021.
public class Customer {

    // Data filed of Customer
    private int id;
    private String name;
    private String nationality;
    private char gender;
    private int phone;
    private int rental_days;

    // contructors of Customer
    public Customer(int id, String name, String nationality, char gender, int phone) {

        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.phone = phone;
    }

    // Setters and Getters of Data filed
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getRental_days() {
        return rental_days;
    }

    public void setRental_days(int rental_days) {
        this.rental_days = rental_days;
    }

    // Override and return to String
    @Override
    public String toString() {
        return "\n	ID: " + id + "\n	Name: " + name + "\n	Nationality :" + nationality + "\n	Gender: " + gender
                + "\n	Phone: " + phone;
    }

}
