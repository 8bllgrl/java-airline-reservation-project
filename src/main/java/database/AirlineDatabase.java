package database;

import objects.Flight;
import objects.Traveler;

import java.util.ArrayList;
import java.util.HashMap;

public class AirlineDatabase {

    //traveler/user classes are put into an array here.

    ArrayList<Traveler> userLookupDatabase;
    HashMap<Traveler, ArrayList<Flight>> userDetailedLookupDatabase; //user has a list of flights they have purchased.


    //TODO: ToString overwrite.
}
