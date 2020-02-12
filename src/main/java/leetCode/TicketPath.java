package leetCode;

import java.util.*;

public class TicketPath {
    private static HashMap<String, LinkedHashSet<String>> flights;
    
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
//                
//                go through each city in the arrivals
                for (String cityArrived : allArrivals) {
//                    see if it was departed from, i.e. is it a key in the hashmap
                    if (flights.get(cityArrived) != null) {
//                        if it is add its list of where I can go from the current arrival city
                        if (allArrivals.addAll(flights.get(cityArrived))) {
//                            if any cities were added to the list get the last one and add its list of where I can go from there.
                            while (flights.get(getLastElement(allArrivals)) != null && allArrivals.addAll(flights.get(getLastElement(allArrivals)))) {
                                }
//                            if nothing is added check if the list is the same size as 
                            if (flights.get(city).size() == flights.size()) {
                                System.out.println("succccccesss start city is " + city);
                                System.out.println("Flight Path is: "+buildString(city, allArrivals));
                                return buildString(city, allArrivals);
                            }
                        }
                    }
                }
//          }
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
