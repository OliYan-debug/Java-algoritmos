package heranca;

public class Bicicleta extends Veiculo{
    int rodas = 2;
    @Override
    void go() {
        System.out.println("Bicicleta está acelerando");
    }

    @Override
    void stop() {
        System.out.println("Bicicleta está parada");
    }
}
