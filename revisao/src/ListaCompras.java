import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product;
        String userInput;
        while(true){
            System.out.println("Qual o produto deseja adicionar a lista de compras? ");
            product = scan.nextLine();
            if(!product.equals("") && !product.equalsIgnoreCase("quit")){
                cart.addToCart(product);
                System.out.println("Deseja continuar comprando? ");
                userInput = scan.next();
                if(userInput.equalsIgnoreCase("s")){
                    System.out.printf("%n[Seu Carrinho] produtos %d %n", cart.getTamanhoCarrinho());
                    cart.listCart();
                    System.out.println("\n aperte enter para continuar ou digite del para excluir um produto ");
                    scan.nextLine(); // fix scan problem
                    userInput = scan.nextLine();
                    if(userInput.equalsIgnoreCase("del")) {
                        System.out.print("Digite o [#] do produto: ");
                        userInput = scan.nextLine();

                    }
                    if(!userInput.equals("")){
                        cart.removeFromCart(Integer.parseInt(userInput));
                    }

                    System.out.println();

                }else{
                    System.out.println("\n[Suas compras]\n");
                    cart.listCart();
                    break;
                }
            }else{
                System.out.println("Por favor preencha com um produto válido");
            }

        }

        scan.close();
    }

}

class cart{
    static ArrayList<String> carrinho = new ArrayList<String>();
    static void addToCart(String product){
        carrinho.add(product);
    }
    static void listCart(){
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.printf("%n [%d] - %s", i, carrinho.get(i));
        }
    }

    public static int getTamanhoCarrinho() {
        return carrinho.size();
    }

    static void removeFromCart(int product){
        try {
            carrinho.remove(product);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Por favor indique um produto da lista indicada");
        }
    }

}

