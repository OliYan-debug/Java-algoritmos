public class MagazineStand {

    private int stock;
    private double initialStockPrice, finalSalesPrice;


    public void setStock(Magazine[] magazines) {
        for (Magazine magazine : magazines) {
            this.stock += magazine.getStock();
            this.initialStockPrice += magazine.getPrice();
        }
    }

    public int getStock() {
        return stock;
    }

    public void buyMagazine(Magazine magazine, int quantity){
        if(magazine.getStock() == 0){
            System.out.printf("A revista %s não está mais dísponivel%n", magazine.getBrand());
        }else if(magazine.getStock() < quantity){
            System.out.printf("A revista %s não tem disponibilidade para essa quantidade o estoque atual é de %d revistas%n",
                    magazine.getBrand(), magazine.getStock());
        }
        else{
            magazine.setStock(magazine.getStock() - quantity);
            this.stock -= quantity;
            double saleBonus = 0.4;
            this.finalSalesPrice += (magazine.getPrice() + magazine.getPrice() * saleBonus) * quantity;
            System.out.printf("Parabéns você acabou de comprar %d unidades da revista %s%n", quantity, magazine.getBrand());
        }
    }

    public String getProfits() {
        if(this.stock == 0) {
            double profits = finalSalesPrice - initialStockPrice;
            return "Os lucro da banca foi de R$" + String.format("%.2f", profits);
        }else{
            return "Você deve vender todo o estoque para pode ver os lucros!";
        }
    }



}
