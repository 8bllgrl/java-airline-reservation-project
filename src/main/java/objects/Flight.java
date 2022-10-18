package objects;

public class Flight {

    private int departureMonth;
    private int departureDay;
    private int departureYear;

    private int departureTimeHr;
    private int departureTimeMin;
    private char departureTimeAM;

    private int arrivalTimeHr;
    private int arrivalTimeMin;
    private char arrivalTimeAM;

    private int flightDurationTime;

    private String departureTimeFull;
    private String arrivalTimeFull;
    private int priceTotal;

    private Traveler[][] seats = new Traveler[6][27]; // 6 = abcdef, 27 = row. example seat: A27, or E14
    //TODO: method to create a seat arrangement in a certain pattern.


    Flight(int departureMonth, int departureDay, int departureYear, String departureTimeFull, String arrivalTimeFull, int priceTotal) {
        this.departureMonth = departureMonth;
        this.departureDay = departureDay;
        this.departureYear = departureYear;

        this.departureTimeFull = departureTimeFull;
        this.arrivalTimeFull = arrivalTimeFull;
        this.priceTotal = priceTotal;
    }

}
