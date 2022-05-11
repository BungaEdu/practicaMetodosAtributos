import java.util.Scanner;

public class prueba3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime: ");
            char sex = sc.nextLine().charAt(0);

            while (sex!='H' && sex!='H') {
                System.out.print("Error");
                sex=sc.nextLine().charAt(0);
            }

            System.out.print(sex);

        }
}
