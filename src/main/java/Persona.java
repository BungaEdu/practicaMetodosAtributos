import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Date;

public class Persona {
    private String identificador;
    private String nombre;
    private String fechaNacimiento; //controlar formato fechas;
    private Character sexo;
    private float peso;
    private float altura;
    private String aficiones;//crear array












    /***********************CONSTRUCTORES**********************/
    Persona() {
    }

    Persona (String nombre, String fechaNacimiento, char sexo) {
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.sexo=sexo;
    }

    Persona (String nombre, String fechaNacimiento, char sexo, float peso, float altura, String aficiones) {
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }


    /*********************************SETTER***********************/
    public void setNombre (String nombre) {
        this.nombre=nombre;
    }
    public void setFechaNacimiento (String fechaNacimiento) {
        this.fechaNacimiento=fechaNacimiento;
    }
    public void setSexo (char sexo) {
        this.sexo=sexo;
    }
    public void setPeso (float peso) {
        this.peso=peso;
    }
    public void setAltura (float altura) {
        this.altura=altura;
    }
    public void setAficiones (String aficiones) {
        this.aficiones=aficiones;
    }

    /**********************GETTER***********************/
    public String getNombre() {
        return nombre;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
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

    /***********************MÉTODOS*******************/
    public static float calcularIMC (float peso, float altura){
        final float debajo =-1, ideal=0, sobrepeso=1;
        float imc=peso/(altura*altura);
         if (imc <20)
             return debajo;
            else if (imc >=20 && imc <=25)
                return ideal;
                else
                    return sobrepeso;
    }

    public static int calcularEdad (Date fechaNac) {
        Date fechaUs =new Date (0,0,0);
        return 1;
    }

    public static void controlSexo (char sexo) {
        while (sexo != 'h' || sexo != 'm') {
            System.out.println("Error, debes introducir 'h' (hombre) o 'm' (mujer)");
        }
    }

//    public static boolean mayorEdad (){}//calcular fechas
//qué significa que INTRODUZCA UN SEXO CORRECTO;

    public static int generarIdentificador (){
        Random r = new Random();
        int newIdent = r.nextInt(6)+1;
        return newIdent;
    }
}
