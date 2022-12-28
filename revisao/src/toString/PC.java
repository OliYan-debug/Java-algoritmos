package toString;

public class PC {
    private String Motherboard, Cpu, storage, Psu;
    private int Ram;

    public PC(String Motherboard, String Cpu, String Psu, int Ram, String storage){
        this.Motherboard = Motherboard;
        this.Cpu = Cpu;
        this.Psu = Psu;
        this.Ram = Ram;
        this.storage = storage;
    }

    public void setMotherboard(String motherboard) {
        this.Motherboard = motherboard;
    }

    public void setPsu(String psu) {
        this.Psu = psu;
    }

    public void setCpu(String cpu) {
        this.Cpu = cpu;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setRam(int ram) {
        this.Ram = ram;
    }

    public String toString() {
        return String.format("%n Placa Mãe: %s%n Processador: %s%n Memória Ram: %sgb%n Storage: %s%n Fonte: %s%n",
                Motherboard, Cpu, Ram, storage, Psu
                );
    }
}
