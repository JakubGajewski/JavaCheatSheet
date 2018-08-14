package pl.rolf;

public class Main {

    public static void main(String[] args) {
	    double ran = (double) (Math.random());
	    String weapon;
	    if (ran < 0.3) {
	        weapon = "bazooka";
            }
	    else if (ran >= 0.3 && ran < 0.7){
	        weapon = "banana bomb";
            }
        else {
	        weapon = "mortar";
        };
        System.out.println(ran);
        System.out.println("You've drawed "+weapon);
    }
}
