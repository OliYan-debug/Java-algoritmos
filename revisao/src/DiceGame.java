import java.util.Random;
import java.util.Scanner;
public class DiceGame {

    public static void main(String[] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String userInput;
        int diceNum;
        while(true){
            System.out.println("Deseja rolar o dado? ");
            userInput = scan.nextLine();
            if(userInput.equalsIgnoreCase("s")){
                diceNum = random.nextInt(6) + 1;
                System.out.printf("%nO dado caiu no %d%n", diceNum);
            }else{
                break;
            }
        }






        scan.close();
    }
}
