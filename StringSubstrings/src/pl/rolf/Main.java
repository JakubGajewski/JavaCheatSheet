package pl.rolf;

public class Main {

    public static void main(String[] args) {
	    String names = "Adam Arek Anastazja Błażej Bożena Cyceron Diamokles Edyta Eugeniusz Filip Grzegorz Helena Lucjan Wanda Zygmunt Zdzisław";
	    int indexB = names.indexOf('B');
	    int indexC = names.indexOf('C');
        String naB = names.substring(indexB,(indexC-1));
        System.out.println(naB);

        int indexKobieta = names.lastIndexOf("a ");
        System.out.println(indexKobieta);
    }
}
