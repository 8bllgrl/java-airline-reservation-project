package objects;

public class CreditCardInfo {

    //    //Credit card / payment   information:
    private String cardType;
    private String cardHolderName; //first and last
    private int cardNumber; //16 digits

    //    private int expirationMonth; //2 digits
//    private int expirationYear; //2 digits
    private String expirationFull; //   [00/00]

    private int authNumber; //3 digits


    CreditCardInfo(String cardType, String cardHolderName, int cardNumber, int expirationMonth, int expirationYear, int authNumber) {
        this.cardType = cardType;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;

        this.expirationFull = expirationMonth + "/" + expirationYear;
        this.authNumber = authNumber;
    }
}
