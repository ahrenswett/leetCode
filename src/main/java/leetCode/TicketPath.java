package leetCode;

import java.util.*;

public class TicketPath {
    private static HashMap<String, LinkedHashSet<String>> flights;
    private static HashMap<String, String> flights2;

//    No use of helper functions
    public static String ticketPathDecoderV2(Stack<Ticket> stackOfTickets){
        flights2 = new HashMap<>();
        ArrayList<String> arrivals  = new ArrayList<>();

        for(int i = stackOfTickets.size(); i > 0 ; i--){
            Ticket ttp = stackOfTickets.pop();
            arrivals.add(ttp.arrive);
            flights2.put(ttp.depart,ttp.arrive);
        }
//        get all the flight departures and compare to the arrivals
        for(String city : flights2.keySet()) {
//            if arrivals does not contain the departure city it must be the origin
            if(!arrivals.contains(city)){
//                found the start city, return the path
                StringBuilder flightPath = new StringBuilder();
                flightPath.append(city);
//                loop through getting the city's value, appending it, and setting it as city
                while( (city = flights2.get(city)) !=null ){
                    flightPath.append(", "+city);
                }
                return flightPath.toString();
            }
        }
        return "No Clear Flight Path";
    }


//    this one utilizes hashmaps and helper functions
    public static String ticketPathDecoder(Stack<Ticket> stackOfTickets){
        flights = new HashMap<>();
//        deque the stack into a hashmap using the departure as key.
        while(!stackOfTickets.isEmpty()){
//            get a ticket
            Ticket ttp = stackOfTickets.pop();
//            Make a linked hashset to store the path from depart to destination.
            LinkedHashSet<String> arrivals = new LinkedHashSet<>();
//            add the arrival to arrivals LHS
            arrivals.add(ttp.arrive);
//            then add the tickets depart as key and the new arrivals LHS as value to flights HM
            flights.put(ttp.depart,arrivals);
        }
//        go through all the keys
        for (String city : flights.keySet()) {
//                get the hashset of where I can go from the current city
            LinkedHashSet<String> allArrivals = flights.get(city);
//            store the last place in the keys value HS
            String lastArrived = getLastElement(allArrivals);

            while (flights.get(lastArrived) != null &&
                    allArrivals.addAll(flights.get(lastArrived))){
                lastArrived = getLastElement(allArrivals);
            }
            if (allArrivals.size() == flights.size()){
                return buildString(city, allArrivals);
            }
        }
        return "No valid path";
    }







    //    https://stackoverflow.com/questions/8360785/java-get-last-element-of-a-collection
    public static <T> T getLastElement(final Iterable<T> elements) {
        T lastElement = null;
        for (T element : elements) {
            lastElement = element;
        }
        return lastElement;
    }


    private static String buildString(String city, LinkedHashSet<String>  path){
        StringBuilder str = new StringBuilder();
        str.append(city);
        for(String dest : path){
            str.append(", "+ dest);
        }
        return str.toString();
    }
}


class Ticket{
    String depart;
    String arrive;

    public Ticket(String depart, String arrive) {
        this.depart = depart;
        this.arrive = arrive;
    }
}
