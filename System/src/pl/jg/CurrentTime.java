package pl.jg;

public class CurrentTime {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365.25);

//This method returns the difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC(coordinated universal time).
    }
}
