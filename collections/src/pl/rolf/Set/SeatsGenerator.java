package pl.rolf.Set;

import java.util.HashSet;
import java.util.Set;

class SeatsGenerator {

    public HashSet<Seat> createSeats(int rows, int seatsInRow) {
        HashSet<Seat> seats = new HashSet<>();
        int numberOfSeats = rows * seatsInRow;
        for (int i = 0; i < numberOfSeats; i++) {
            Seat zupa = new Seat(String.valueOf(i));
            seats.add(zupa);
        }
        return new HashSet<>();
    }
}
