import java.util.Scanner;

public class GestionaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona pers1 = new Persona();
        Persona pers2 = new Persona("", "", ' ');
        Persona pers3 = new Persona ("","", ' ', 0, 0, "");

        //System.out.println(Persona.generarIdentificador());

        /*************************PERSONA 1*****************************
        System.out.println("Persona 1: ");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        pers1.setNombre(nombre1);

        System.out.print("Dime fecha de nacimiento en formato (dd/mm/yyyy): ");
        String fechaNac1 = sc.nextLine();
        pers1.setfechaNac(fechaNac1);

        System.out.print("Dime peso: ");
        float peso1 = Float.parseFloat(sc.nextLine());
        pers1.setPeso(peso1);

        System.out.print("Dime altura: ");
        float altura1 = Float.parseFloat(sc.nextLine());
        pers1.setAltura(altura1);

        System.out.print("Dime aficiones: ");
        String aficiones1 = sc.nextLine();
        pers1.setAficiones(aficiones1);
*/

        /*************************PERSONA 2*****************************
        System.out.println("Persona 2: ");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        pers2.setNombre(nombre2);

        System.out.print("Dime fecha de nacimiento en formato (dd/mm/yyyy): ");
        String fechaNac2 = sc.nextLine();
        pers1.setfechaNac(fechaNac2);

        System.out.print("Dime peso: ");
        float peso2 = Float.parseFloat(sc.nextLine());
        pers1.setPeso(peso2);

        System.out.print("Dime altura: ");
        float altura2 = Float.parseFloat(sc.nextLine());
        pers1.setAltura(altura2);

        System.out.print("Dime aficiones: ");
        String aficiones2 = sc.nextLine();
        pers1.setAficiones(aficiones2);


        /*************************PERSONA 3*****************************
        System.out.println("Persona 3: ");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        pers3.setNombre(nombre3);

        System.out.print("Dime fecha de nacimiento en formato (dd/mm/yyyy): ");
        String fechaNac3 = sc.nextLine();
        pers1.setfechaNac(fechaNac3);

        System.out.print("Dime peso: ");
        float peso3 = Float.parseFloat(sc.nextLine());
        pers1.setPeso(peso3);

        System.out.print("Dime altura: ");
        float altura3 = Float.parseFloat(sc.nextLine());
        pers1.setAltura(altura3);

        System.out.print("Dime aficiones: ");
        String aficiones3 = sc.nextLine();
        pers1.setAficiones(aficiones3);
        */


        System.out.print("Dime sexo: ");
        char sexo = sc.next().charAt(0);
        Persona.controlSexo(sexo);
        pers1.setSexo(sexo);


        /**************MENSAJE PESO***********
        int mensajePesoPers1 = Persona.calcularIMC(pers1.getPeso(),pers1.getAltura());
        if (mensajePesoPers1==-1)
            System.out.println(pers1.getNombre() + " está por debajo del peso ideal");
        else if (mensajePesoPers1==0)
            System.out.println(pers1.getNombre() + " estás en el peso ideal");
        else if (mensajePesoPers1==1)
            System.out.println(pers1.getNombre() + " tiene sobrepeso");

        int mensajePesoPers2 = Persona.calcularIMC(pers2.getPeso(),pers2.getAltura());
        if (mensajePesoPers2==-1)
            System.out.println(pers2.getNombre() + " estás por debajo del peso ideal");
        else if (mensajePesoPers2==0)
            System.out.println(pers2.getNombre() + " estás en el peso ideal");
        else if (mensajePesoPers2==1)
            System.out.println(pers2.getNombre() + " tiene sobrepeso");

        int mensajePesoPers3 = Persona.calcularIMC(pers3.getPeso(),pers3.getAltura());
        if (mensajePesoPers3==-1)
            System.out.println(pers3.getNombre() + " estás por debajo del peso ideal");
        else if (mensajePesoPers3==0)
            System.out.println(pers3.getNombre() + " estás en el peso ideal");
        else if (mensajePesoPers3==1)
            System.out.println(pers3.getNombre() + " tiene sobrepeso");
        */


        /*************MAYOR EDAD*****************
        Persona p = new Persona();
        int edadPers1= Persona.calcularEdad(pers1.getFechaNac());
        if(p.mayorEdad(edadPers1)==true)
            System.out.println(pers1.getNombre() + " es mayor de edad");
            else
                System.out.println(pers1.getNombre() + " es menor de edad");

            /*
        int edadPers2= Persona.calcularEdad(pers2.getFechaNac());
        if(p.mayorEdad(edadPers2)==true)
            System.out.println(pers2.getNombre() + " es mayor de edad");
        else
            System.out.println(pers2.getNombre() + " es menor de edad");

        int edadPers3= Persona.calcularEdad(pers2.getFechaNac());
        if(p.mayorEdad(edadPers3)==true)
            System.out.println(pers3.getNombre() + " es mayor de edad");
        else
            System.out.println(pers3.getNombre() + " es menor de edad");
*/
    }
}