import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportTower {

    private List<String> airports;
    private List<List<String>> routes;
    private String startingPoint;

    public AirportTower(String[] airports, String[][] routes, String lga) {
        this.routes = new ArrayList<>();
        this.airports = (Arrays.asList(airports));

        List<String> newList = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {

            newList = Arrays.asList(routes[i]);
            this.routes.add(newList);

        }
        System.out.println(this.routes);
        this.startingPoint = lga;
    }

    public void computeRouting() {

        List<String> startNodes = findStartNodes();
        System.out.println(Arrays.toString(startNodes.toArray()));

    }

    private List<String> findStartNodes(){
        List<String> startNodes = new ArrayList<>();
        for (String airport : airports) {

            if(routes.stream().noneMatch(e -> e.get(1).equals(airport)))
                startNodes.add(airport);
        }
        return startNodes;
    }
}
