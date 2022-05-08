import java.util.Scanner;

public class GestionaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona pers1 = new Persona();
        Persona pers2 = new Persona("", "", ' ');
        Persona pers3 = new Persona ("","", ' ', 0, 0, "");

        System.out.println("Dime nombre: ");
        String nombre = sc.nextLine();
        pers1.setNombre(nombre);
        pers2.setNombre(nombre);
        pers3.setNombre(nombre);

        System.out.println("Dime fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        pers1.setFechaNacimiento(fechaNacimiento);
        pers2.setFechaNacimiento(fechaNacimiento);
        pers3.setFechaNacimiento(fechaNacimiento);

        System.out.println("Dime sexo: ");
        char sexo = sc.next().charAt(0);
        pers1.setSexo(sexo);
        pers2.setSexo(sexo);
        pers3.setSexo(sexo);

        System.out.println("Dime peso: ");
        char sexo = parseInt.nextLine(); //Verificar el parseint


        System.out.println("Dime altura: ");


        System.out.println("Dime aficiones: ");

    }
}
