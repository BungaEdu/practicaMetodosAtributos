import java.util.*;

public class Persona {
    final char constSexMujer = 'M';
    private String identificador = " ";
    private String nombre = " ";
    private String fechaNac = " "; //controlar formato fechas;
    private Character sexo = constSexMujer;
    private float peso = 0;
    private float altura = 0;
    private String aficiones = " ";//crear array

    /***********************CONSTRUCTORES**********************/
    Persona() {
    }

    Persona(String nombre, String fechaNac, char sexo) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    Persona(String nombre, String fechaNac, char sexo, float peso, float altura, String aficiones) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    /*********************************SETTER***********************/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setfechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setAficiones(String aficiones) {
        this.aficiones = aficiones;
    }

    /**********************GETTER***********************/
    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String aficiones() {
        return aficiones;
    }


    /****************************toString*********************/
    public String toString() {
        return "El identificador es " + identificador + ", el nombre es " + nombre +
                ", la fecha de nacimiento es " + fechaNac + ", el sexo es " + sexo + ", el peso es " + peso +
                ", la altura es " + altura + " y las aficiones son: " + aficiones;
    }

    /***********************MÉTODOS*******************/
    public static int calcularIMC(float peso, float altura) {
        //final float debajo = -1, ideal = 0, sobrepeso = 1;
        float imc = peso / (altura * altura);
        if (imc < 20)
            return -1;
        else if (imc >= 20 && imc <= 25)
            return 0;
        else
            return 1;
    }

    public static int calcularEdad(String fechaNac) {

        /*************CONTROL FORMATO - Solicitud fecha nacimiento********/
        Scanner sc = new Scanner(System.in);
        /*while (fechaNac.length() <10) {
            System.out.print("Introduce una fecha correcta (formato dd/mm/yyyy): ");
            fechaNac = sc.nextLine();
        }*/

        /*************Fecha nacimiento********/

        char[] fechaNacToCharArray = fechaNac.toCharArray();
        int dayCar1 = Character.getNumericValue(fechaNacToCharArray[0]);
        ;
        int dayCar2 = Character.getNumericValue(fechaNacToCharArray[1]);
        int monthCar1 = Character.getNumericValue(fechaNacToCharArray[3]);
        int monthCar2 = Character.getNumericValue(fechaNacToCharArray[4]);
        int yearCar1 = Character.getNumericValue(fechaNacToCharArray[6]);
        int yearCar2 = Character.getNumericValue(fechaNacToCharArray[7]);
        int yearCar3 = Character.getNumericValue(fechaNacToCharArray[8]);
        int yearCar4 = Character.getNumericValue(fechaNacToCharArray[9]);

        int dayBorn = Integer.valueOf(String.valueOf(dayCar1) + String.valueOf(dayCar2));
        int monthBorn = Integer.valueOf(String.valueOf(monthCar1) + String.valueOf(monthCar2));
        int yearBorn = Integer.valueOf(String.valueOf(yearCar1) + String.valueOf(yearCar2) + String.valueOf(yearCar3) + String.valueOf(yearCar4));

        Calendar fechaBorn = Calendar.getInstance();
        fechaBorn.set(yearBorn, monthBorn, dayBorn);
        int numDayOfYearBorn = fechaBorn.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año

        /**************Fecha actual******************/
        Calendar fechaActual = Calendar.getInstance();
        int yearAct = fechaActual.get(Calendar.YEAR);
        int monthAct = fechaActual.get(Calendar.MONTH);
        int dayAct = fechaActual.get(Calendar.DAY_OF_MONTH);
        fechaActual.set(yearAct, monthAct, dayAct);
        int numDayOfYearActual = fechaActual.get(Calendar.DAY_OF_YEAR);// Aquí obtengo el dia del año

        /**************Tratamiento eedad***************/
        int edad = 0;
        int auxAge = yearAct - yearBorn;
        if (numDayOfYearActual < numDayOfYearBorn)
            return auxAge - 1;
        else
            return auxAge;
}

    public static char controlSexo (char sexo) {
        Scanner sc = new Scanner(System.in);
        while (sexo != 'M' && sexo != 'H') {
            System.out.print("Error, debes introducir 'H' (hombre) o 'M' (mujer): ");
            sexo=sc.nextLine().charAt(0);
        }
        return sexo;
    }

    public boolean mayorEdad (int edad) {
        if (edad >= 18)
            return true;
        else
            return false;
    }

    public static int generarIdentificador (){
        final int tamCifras=6;
        int newIdent=0;
        Random r = new Random();
        String cad = "";
        for(int i=0;i<tamCifras;i++) {
            newIdent = r.nextInt(10);
            cad = cad+newIdent;
        }
        return Integer.parseInt(cad);
    }
}


