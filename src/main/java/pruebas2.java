import java.sql.SQLOutput;
import java.util.Scanner;

public class pruebas2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime cadena: ");

            String fechaNac = sc.nextLine();
            char []fechaNacToCharArray = fechaNac.toCharArray();
            int dayCar1=Character.getNumericValue(fechaNacToCharArray[0]);;
            int dayCar2=Character.getNumericValue(fechaNacToCharArray[1]);
            int monthCar1=Character.getNumericValue(fechaNacToCharArray[3]);
            int monthCar2=Character.getNumericValue(fechaNacToCharArray[4]);
            int yearCar1=Character.getNumericValue(fechaNacToCharArray[6]);
            int yearCar2=Character.getNumericValue(fechaNacToCharArray[7]);
            int yearCar3=Character.getNumericValue(fechaNacToCharArray[8]);
            int yearCar4=Character.getNumericValue(fechaNacToCharArray[9]);

            int dayBorn = Integer.valueOf(String.valueOf(dayCar1) + String.valueOf(dayCar2));
            int monthBorn = Integer.valueOf(String.valueOf(monthCar1) + String.valueOf(monthCar2));
            int yearBorn = Integer.valueOf(String.valueOf(yearCar1) + String.valueOf(yearCar2) + String.valueOf(yearCar3) + String.valueOf(yearCar4));



        }


}
