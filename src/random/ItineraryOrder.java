package random;
import java.util.*;

public class ItineraryOrder {

    public static void findItinerary(Map<String, String> tickets) {
        // Write code here
        // Create a reverse map to find the starting city
        Map<String, String> reverseTickets = new HashMap<>();
        for (Map.Entry<String, String> entry : tickets.entrySet()) {
            reverseTickets.put(entry.getValue(), entry.getKey());
        }

        // Find the starting city
        String startCity = null;
        for (String city : tickets.keySet()) {
            if (!reverseTickets.containsKey(city)) {
                startCity = city;
                break;
            }
        }

        if (startCity == null) {
            System.out.println("Invalid Input");
            return;
        }

        // Print the itinerary
        while (startCity != null) {
            String destination = tickets.get(startCity);
            System.out.println(startCity + "->" + destination);
            startCity = destination;
        }
    }

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            tickets.put(sc.next(),sc.next());
        }
        findItinerary(tickets);
    }
}