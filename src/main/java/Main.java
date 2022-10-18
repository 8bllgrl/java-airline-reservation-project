
//////Notes:
//


//////TODO:

//the user information page creates a user class
//make checkers to make sure that the user input something that wont throw an error, such as a string in an int's place.
//TODO: Make a method that converts standard time to military time so that flight durations can be calculated.

public class Main {

    /* Description */
    /*  */

    //TODO: variables for locations to go to.
    //jetblue locations:
    // New york city
    //Austin Texas
    //detroit, michigan
    //las vegas
    //los angeles, california
    //miami florida
    //west virginia
    //arizona
    //salt lake city
    //oregon
    //maine
    //new orleans
    //seattle washington
    //atlanta georgia
    private static final String NEWYORK_ABR = "NYC";
    private static final String AUSTINTX_ABR = "AUS";
    private static final String DETROITMI_ABR = "";
    private static final String LASVEGAS_ABR = "";
    private static final String LAXCALI_ABR = "";
    private static final String MIAMIFL_ABR = "";
    private static final String WESTVIRGINIA_ABR = "";
    private static final String PHOENIXARIZONA_ABR = "";
    private static final String SALTLAKECITYUT_ABR = "";
    private static final String OREGONPORTLAND_ABR = "";
    private static final String MAINEPORTLAND_ABR = "";
    private static final String NEWORLEANSLOU_ABR = "";
    private static final String SEATTLEWA_ABR = "";
    private static final String ATLANTAGEORGIA_ABR = "";


    //quit = Main page, main loop. Makes sure that it is running. think of this like the window. :)
    private static boolean quit = false;
    //page 1: looks for user response in which location the traveler wishes to go to, and automatically inputs where the traveler is coming from. (NYC)
    private static boolean displayInitializationPage;
    //page 2: looks for a user response for when the user wishes to depart ( 00/00/0000 format )
    private static boolean displayDepartDatePage;
    //page 3: creates a list of flights for that day the user inputs. Allows the user to select one of these available flights.
    private static boolean displayListOfFlightsPage;
    //page 4: prints out the details of the flight and asks if the user wishes to continue.
    private static boolean displayFlightDetailsPage;
    //page 5: asks for user input on all the traveler's details, allowing some to be optional/null. These will be stored and saved for later to make a traveler class.
    private static boolean displayTravelerInformationFormPage;
    //page 6: asks for the user to pick a seat, which allows the user input to be converted into a spot in a multidimensional array, and checks if the seat has been taken or not.
    private static boolean displaySeatSelectionPage;
    //page 7: asks the user to review flight details once again, and then asks for the credit card information. when the credit card information is given, the process is complete. The traveler info is all stored into an object and sent to the database into a hashmap that stores the user's flight information and their personal information in a key value pair.
    private static boolean displayReviewAndPaymentPage;


    public static void main(String[] args) {


        //TODO: Progressively show more steps to the process when you progress through the pages in the main loop.
//        while (!quit){
//        }


    }
}
