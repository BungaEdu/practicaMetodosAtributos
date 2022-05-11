/*import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        /*************Solicitud fecha nacimiento********
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

        Calendar fechaNac = Calendar.getInstance();
        fechaNac.set(yearBorn, monthBorn, dayBorn);
        int numDayOfYearBorn = fechaNac.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año
        System.out.print("El num de dia inciial es: " + numDayOfYearBorn);

        /**************Fecha actual******************
        Calendar fechaActual = Calendar.getInstance();
        int yearAct = fechaActual.get(Calendar.YEAR);
        int monthAct = fechaActual.get(Calendar.MONTH);
        int dayAct = fechaActual.get(Calendar.DAY_OF_MONTH);
        fechaActual.set(yearAct, monthAct, dayAct);
        int numDayOfYearActual = fechaActual.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año
        System.out.print("El num de dia actual es: " + numDayOfYearActual);

        /**************Tratamiento eedad***************
        int edad = 0;
        int auxAge = yearAct - yearBorn;
        if (numDayOfYearActual < numDayOfYearBorn)
            edad = auxAge - 1;
        else
            edad = auxAge;
    }
}
*/