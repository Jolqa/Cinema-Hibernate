import entity.Cinema;
import entity.Location;
import service.CinemaService;

public class Main {
    public static void main(String[] args) {
        CinemaService cinemaService = new CinemaService ();

        Cinema cinema1 = new Cinema ();
        cinema1.setLocation (Location.GDAŃSK);
    }
}
