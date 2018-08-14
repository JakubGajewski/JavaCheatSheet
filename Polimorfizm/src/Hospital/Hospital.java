package Hospital;

import java.util.Arrays;

public class Hospital {
    private Person[] personel;

    public Person[] getPersonel() {
        return personel;
    }

    public void setPersonel(Person[] personel) {
        this.personel = personel;
    }

    public void add (Person newPatient) {
        Person[] newPatientsArray = new Person[personel.length + 1];
        for (int i = 0; i < personel.length; i++) {
            newPatientsArray[i] = personel[i];
        }
        newPatientsArray[personel.length] = newPatient;
        personel = newPatientsArray;
    }

    public Hospital(Person[] personel) {
        this.personel = personel;
    }

    public Hospital() {
    }

    @Override
    public String toString() {
        return "Personel: " + Arrays.toString(personel);
    };
}
