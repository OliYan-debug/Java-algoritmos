import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        // exemplo do Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome ? ");
        String nome = scan.nextLine();
        System.out.println("Qual o sua idade ? ");
        int age = scan.nextInt();
        scan.nextLine(); // fix
        System.out.println("Qual a sua comida favorita ? ");
        String comidaFavorita = scan.nextLine();
        scan.close();

        System.out.println(nome + " " + age + " anos " + "gosta de " + comidaFavorita);
    }
}