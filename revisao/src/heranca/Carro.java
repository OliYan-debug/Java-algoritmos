package heranca;

public class Carro extends Veiculo{
    int rodas = 4;
    @Override
    void go() {
        System.out.println("Carro está acelerando");
    }

    @Override
    void stop() {
        System.out.println("Carro está parado");
    }
}
