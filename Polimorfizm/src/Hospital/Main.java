package Hospital;/*Napisz program, który będzie symulował zarządzanie szpitalem w polskich realiach. Zdefiniuj klasy:

Hospital.Person - przechowuje imię i nazwisko osoby oraz informację o wysokości wypłaty
Hospital.Doctor - rozszerza klasę Hospital.Person o dodatkowe pole bonus (premia)
Hospital.Nurse (pielęgniarka) - rozszerza klasę Hospital.Person o pole overtime (nadgodziny)
Hospital.Hospital - przechowuje informacje o pracownikach szpitala w tablicy typu Hospital.Person[].
Powinna istnieć metoda add() pozwalająca dodać nowego pracownika do tablicy pracowników

Każda z klas powinna posiadać konstruktor pozwalający zainicjować wszystkie pola danej klasy. Załóż, że w szpitalu
pracują 3 osoby - 1 lekarz i 2 pielęgniarki, przypisz ich do tablicy w obiekcie Hospital.Hospital. Zdefiniuj w klasie Hospital.Hospital
metodę toString(), która z wykorzystaniem pętli for zwróciinformacje o każdym pracowniku. W przypadku każdego z nich
informacja ta powinna mówić o wszystkich polach jakie przechowuje dana klasa (wykorzystaj metodę toString()).
*/
// write your code here


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] zupa = {"a", "aa"};

        Person[] personel = {
                new Doctor("AAA","BBB", 123, 345),
                new Nurse("AAA","BBB", 123, 345),
                new Nurse("AAA","BBB", 123, 345)
        };

        Hospital hospital = new Hospital(personel);

        System.out.println(hospital.toString());

        Hospital drugiSzpital = new Hospital();
        drugiSzpital.setPersonel(personel);

        System.out.println(drugiSzpital.toString());

        hospital.add(new Doctor("ADA","ADAA", 13, 13));

        System.out.println(hospital.toString());
        System.out.println(drugiSzpital.toString());

        List <Person> ListaOsob = new ArrayList<>();
    }
}
