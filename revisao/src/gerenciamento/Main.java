package gerenciamento;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String selectedOption;
        int id;
        Estoque estoque = new Estoque();
        Scanner scan = new Scanner(System.in);
        estoque.addItem("Bola de futsal", 3);
        estoque.addItem("Bola de vôlei", 13);
        estoque.addItem("Bola de basquete", 5);
        estoque.showItems();
        System.out.print("Deseja atualizar ou remover alguns desses itens [a/r]: ");
        selectedOption = scan.nextLine();
        switch (selectedOption.toLowerCase()) {
            case "a" -> {
                System.out.print("Qual item deseja atualizar? ");
                id = scan.nextInt();
                scan.nextLine();
                System.out.print("Atualizar todos os dados ou Nome/Valor do item [t/e]? ");
                selectedOption = scan.nextLine();
                switch (selectedOption.toLowerCase()) {
                    case "t" -> atualizarTodosDados(id, scan, estoque);
                    case "e" -> atualizarNomeOuQuantidade(id, scan, estoque);
                }
            }
            case "r" -> {
                System.out.print("Qual item deseja remover? ");
                id = scan.nextInt();
                estoque.removeItem(id);
                System.out.println();
                estoque.showItems();
            }
        }

        scan.close();
    }

    static void atualizarTodosDados(int id, Scanner scan, Estoque estoque){
        String name;
        int quantity;
        System.out.print("Nome: ");
        name = scan.nextLine();
        System.out.print("Quantidade: ");
        quantity = scan.nextInt();
        estoque.updateItems(id, name, quantity);
        System.out.println("\n\n");
        estoque.showItems();
    }
    static void atualizarNomeOuQuantidade(int id, Scanner scan, Estoque estoque){
        String selectedOption, name;
        int quantity;
        System.out.print("Nome ou Quantidade [n/q]: ");
        selectedOption = scan.nextLine();
        if(selectedOption.equalsIgnoreCase("n")){
            System.out.print("Nome: ");
            name = scan.nextLine();
            estoque.updateItems(id, name);
        } else if (selectedOption.equalsIgnoreCase("q")) {
            System.out.print("Quantidade: ");
            quantity = scan.nextInt();
            estoque.updateItems(id, quantity);
        }
        estoque.showItems();
    }

}
