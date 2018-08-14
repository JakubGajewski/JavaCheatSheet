package pl.rolf;

public class Main {

    public static void main(String[] args) {
        Integer angle1 = 30;
        Integer angle2 = 60;
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Stopnie","Radiany","Sinus","Cosinus","Tangens");
        System.out.printf("%-10d%-1.4f%-4s%-1.4f%-4s%-1.4f%-4s%-1.4f%-4s\n",
                angle1,Math.toRadians(angle1),"",Math.sin(Math.toRadians(angle1)),"",Math.cos(Math.toRadians(angle1)),"",Math.tan(Math.toRadians(angle1)),"");
        System.out.printf("%-10d%-1.4f%-4s%-1.4f%-4s%-1.4f%-4s%-1.4f%-4s\n",
                angle2,Math.toRadians(angle2),"",Math.sin(Math.toRadians(angle2)),"",Math.cos(Math.toRadians(angle2)),"",Math.tan(Math.toRadians(angle2)),"");
    }
}
