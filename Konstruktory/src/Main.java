public class Main {

    public static void main(String[] args) {

        KonstrukcjaBudowlana wieżaAjfla = new KonstrukcjaBudowlana("Wieża",300,15000);

        KonstrukcjaBudowlana jakiśGaraż = new KonstrukcjaBudowlana("garaż",1);
        jakiśGaraż.setRodzaj("garaż");

        System.out.println(wieżaAjfla.toString());

	// write your code here
    }
}
