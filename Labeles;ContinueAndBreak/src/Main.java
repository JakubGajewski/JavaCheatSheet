public class Main {

    public static void main(String[] args) {

        String s1 = new String();

        outer:
        //should be placed exactly before the loop
        for (int i = 0; i < 100; i++) {   //we can have statements before the outer but not inbetween the label and the loop
            inner:
            for (int j = 0; j < 100; j++) {
                if (j==15) {
                    s1 = "raz";
                    continue;
                }//goes to the top of loopingConstructTwo and continue
                if (j==25) {
                    s1 = "dwa";
                    break;          //breaks out of loopingConstructTwo
                }
                if (j==30){
                    s1 = "trzy";
                    continue outer; //goes to the outer label and reenters loopingConstructOne
                }
                if (j==35){
                    s1 = "cztery";
                    break outer;    //breaks out of the loopingConstructOne

                }
                if (j==40){
                    s1 = "pięć";
                    continue inner; //this will behave similar to continue
                }
            }
        }
        System.out.println(s1);

        int[] numbers= new int[]{100,18,21,30};

        //Outer loop checks if number is multiple of 2
        OUTER:  //outer label
        for(int i = 0; i<numbers.length; i++){
            if(i % 2 == 0){
                System.out.println("Odd number: " + i +
                        ", continue from OUTER label");
                continue OUTER;
            }

            INNER:
            for(int j = 0; j<numbers.length; j++){
                System.out.println("Even number: " + i +
                        ", break  from INNER label");
                break INNER;
            }
        }
    }
}

