import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Magazine veja = new Magazine();
        veja.setBrand("Veja");
        veja.setStock(3);
        veja.setPrice(9.5);
        Magazine devNews = new Magazine();
        devNews.setBrand("Dev News");
        devNews.setPrice(7.5);
        devNews.setStock(2);
        Magazine[] magazines = {veja, devNews};
        MagazineStand magazineStand = new MagazineStand();
        magazineStand.setStock(magazines);

        Scanner scan = new Scanner(System.in);
        while(magazineStand.getStock() != 0){
            System.out.println("\nBem vindo a Banca de Revistas\n");
            System.out.println("Revistas Disponíveis:\n");
         for(int i = 0; i < magazines.length; i++){
             if(magazines[i].getStock() != 0){
                 System.out.printf("[%d] %s R$%s (%d und)%n", i, magazines[i].getBrand(),
                         String.format("%.2f",magazines[i].getPrice()), magazines[i].getStock());
             }
         }
            try{
                System.out.print("\nSelecione sua revista: ");
                int selectedMagazine = scan.nextInt();
                System.out.print("Selecione a quantidade: ");
                int selectedQuantity = scan.nextInt();
                System.out.println();
                magazineStand.buyMagazine(magazines[selectedMagazine], selectedQuantity);
            }catch (Exception e){
                System.out.println("\n Você deve selecionar uma opção válida \n");
            }

        }
        System.out.println("\nBanca Fechada ( Sem estoque )\n");
        System.out.println(magazineStand.getProfits());

    }
}