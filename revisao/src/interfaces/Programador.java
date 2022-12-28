package interfaces;

public class Programador implements Pessoa{
    private String job, name;
    private int age;
    Programador(String name, int age, String job){
        setName(name);
        setAge(age);
        setJob(job);
    }

    @Override
    public void showYourself() {
        System.out.printf("Oi sou %s e sou %s%n", name, job);
    }

    @Override
    public void showInfo() {
        System.out.printf("%nNome: %s%n %nFunção: %s%n%nIdade: %d%n%n", name, job, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
