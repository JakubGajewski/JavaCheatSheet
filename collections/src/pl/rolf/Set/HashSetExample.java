package pl.rolf.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        SeatsGenerator seatsGenerator = new SeatsGenerator();
        HashSet<Seat> seats = new HashSet<>();

        seats.addAll(seatsGenerator.createSeats(3,4));

        System.out.println(seats.isEmpty());

        for (Seat s  : seatsGenerator.createSeats(12, 8)) {
            System.out.println(s.toString());
        };

        for (Seat s : seats) {
            System.out.println(s.toString());
        }

        System.out.println(seats.isEmpty());

        Iterator<Seat> iterator = seats.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Nie działa o_O


    }
}


