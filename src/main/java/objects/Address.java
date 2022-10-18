package objects;

public class Address {


    private String streetAddress;
    private String addressLine2;
    private String city;
    private String state; // 2 char
    private int zipCode; //00000
    private String country;

    Address(String streetAddress, String addressLine2, String city, String state, int zipCode, String country) {

        this.streetAddress = streetAddress;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;

    }
}
