import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        /*************Solicitud fecha nacimiento********/
        Scanner sc = new Scanner(System.in);
        System.out.println("Fecha de nacimiento: ");
        System.out.print("Dia: ");
        int dayBorn = Integer.parseInt(sc.nextLine());
        System.out.print("Mes: ");
        int monthBorn = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print("Año: ");
        int yearBorn = Integer.parseInt(sc.nextLine());

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(yearBorn, monthBorn, dayBorn);
        int numDayOfYearBorn = fechaNacimiento.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año
        System.out.println("El num de dia inciial es: " + numDayOfYearBorn);

        /**************Fecha actual******************/
        Calendar fechaActual = Calendar.getInstance();
        int yearAct = fechaActual.get(Calendar.YEAR);
        int monthAct = fechaActual.get(Calendar.MONTH);
        int dayAct = fechaActual.get(Calendar.DAY_OF_MONTH);
        fechaActual.set(yearAct, monthAct, dayAct);
        int numDayOfYearActual = fechaActual.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año
        System.out.println("El num de dia actual es: " + numDayOfYearActual);

        /**************Tratamiento eedad***************/
        int edad = 0;
        int auxAge = yearAct - yearBorn;
        if (numDayOfYearActual < numDayOfYearBorn)
            edad = auxAge - 1;
        else
            edad = auxAge;
    }
}
