package staticMethod;

public class Pessoa {
    private static int peopleCreated = 0;
    private String name;
    public Pessoa (String name){
        this.name = name;
        peopleCreated++;
    }

    public static int getPeopleCreated() {
        return peopleCreated;
    }
}
