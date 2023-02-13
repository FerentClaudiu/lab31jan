package Exercitiu1;

public class Produs {
    private final String nume;
    private int cantitate;

    public Produs(String nume, int cantitate) {
        this.cantitate = cantitate;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
