public class AirportDriver {
    public static final String[] AIRPORTS = {"BGI", "CDG", "DEL", "DOH", "DSM", "EWR", "EYW", "HND", "ICN",
                                        "JFK", "LGA", "LHR", "ORD", "SAN", "SFO", "SIN", "TLV", "BUD"};

    public static final String[][] ROUTES = {
            {"DSM", "ORD"},
            {"ORD", "BGI"},
            {"BGI", "LGA"},
            {"SIN", "CDG"},
            {"CDG", "SIN"},
            {"CDG", "BUD"},
            {"DEL", "DOH"},
            {"DEL", "CDG"},
            {"TLV", "DEL"},
            {"EWR", "HND"},
            {"HND", "ICN"},
            {"HND", "JFK"},
            {"ICN", "JFK"},
            {"JFK", "LGA"},
            {"EYW", "LHR"},
            {"LHR", "SFO"},
            {"SFO", "SAN"},
            {"SFO", "DSM"},
            {"SAN", "EYW"}
    };


    public static void main(String[] args) {
        AirportTower airportTower = new AirportTower(AIRPORTS, ROUTES, "LGA");
        airportTower.computeRouting();
    }
}
