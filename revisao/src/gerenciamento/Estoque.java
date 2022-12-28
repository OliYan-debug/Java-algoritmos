package gerenciamento;
import java.util.ArrayList;

public class Estoque {

    private ArrayList<String> itemsName = new ArrayList<String>();
    private ArrayList<Integer> itemsQuantity = new ArrayList<Integer>();
    public void addItem(String item, int quantity){
        if(!item.equals(" ") && quantity != 0) {
            itemsName.add(item);
            itemsQuantity.add(quantity);
        }

    }

    public void showItems(){
        System.out.println("|  ID  | |        NOME   (Quant.) |");
        System.out.println("+---------------------------------+");
        for (int i = 0; i < this.itemsName.size(); i++) {
            System.out.printf("|  %-4d| | %s  (%d)  %n", i, itemsName.get(i), itemsQuantity.get(i));
        }
        System.out.println();
    }
    public void updateItems(int id, String nome){
        itemsName.set(id, nome);
    }
    public void removeItem(int id){
        itemsName.remove(id);
        itemsQuantity.remove(id);
    }
    public void updateItems(int id, int quantity){
        itemsQuantity.set(id, quantity);
    }
    public void updateItems(int id, String nome, int quantity){
        itemsName.set(id, nome);
        itemsQuantity.set(id, quantity);

    }
}

