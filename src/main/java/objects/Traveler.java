package objects;


//TODO: get methods inside of traveler to get the credit card info and the address info.
//TODO: Optional variables are set into the traveler object through a setter method.

public class Traveler {

    //What does a user require?
    private String title;
    private String firstName;
    private String lastName;
    private char middleInitial; //TODO setter
    private String suffixOptional; //TODO setter
    private String emailAddress; //TODO setter
    private EnumGender gender;
    private String genderIdentity;
    private String fullDateOfBirth; //TODO makes it based on the month, day, year.
    //full date of birth format: 00/00/0000

    private int phoneNumber;
    //phone number format: 000.000.0000 (0000000000)
    private String emergencyContactFirstName;//TODO setter
    private String emergencyContactEmailAddress;//TODO setter
    private int emergencyContactPhoneNumber;//TODO setter
    private boolean needsWheelchairAssistance;

    Address travelerAddress;
    CreditCardInfo creditCardInfo; //TODO setter


    Traveler(String title, String firstName, String lastName, EnumGender gender, String genderIdentity, String fullDateOfBirth, int phoneNumber, boolean needsWheelchairAssistance, Address address, CreditCardInfo creditCardInfo) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.genderIdentity = genderIdentity;
        this.fullDateOfBirth = fullDateOfBirth;

        this.phoneNumber = phoneNumber;
        this.needsWheelchairAssistance = needsWheelchairAssistance;
        this.travelerAddress = address;
        this.creditCardInfo = creditCardInfo;

    }

    //TEST PASSENGER FOR FLIGHT ARRAY.
    Traveler(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
