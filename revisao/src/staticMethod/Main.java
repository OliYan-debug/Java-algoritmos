package staticMethod;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Alfred");
        Pessoa pessoa2 = new Pessoa("Bruce");
        Pessoa pessoa3 = new Pessoa("Wayne");
        Pessoa pessoa4 = new Pessoa("Alfred");
        Pessoa pessoa5 = new Pessoa("Bruce");
        Pessoa pessoa6 = new Pessoa("Wayne");
        System.out.println(Pessoa.getPeopleCreated());

    }
}
