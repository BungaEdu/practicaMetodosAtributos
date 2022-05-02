import java.util.Random;

public class Persona {
    private String identificador;
    private String nombre;
    private String fechaNacimiento; //controlar formato fechas;
    private Character sexo;
    private float peso;
    private float altura;
    private String aficiones;//crear array

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

//    public static boolean mayorEdad (){}//calcular fechas
//qué significa que INTRODUZCA UN SEXO CORRECTO;

    public static int generarIdentificador (){
        Random r = new Random();
        int newIdent = r.nextInt(6)+1;
        return newIdent;
    }
}


