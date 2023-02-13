package Exercitiu1;

import java.util.ArrayList;

public class Cos {
    private final ArrayList<Produs> produse;

    public Cos() {
        produse = new ArrayList<>();
    }

    public void adaugareProduse(Produs produs) {
        for (Produs p : produse) {
            if (p.getNume().equals(produs.getNume())) {
                p.setCantitate(p.getCantitate() + produs.getCantitate());
                return;
            }
        }
        produse.add(produs);
    }

    public void afiseazaProduse() {
        for (Produs p : produse) {
            System.out.println(p.getNume() + "--->" + p.getCantitate()+"kg");
        }
    }

    public void stergeProdus(Produs produs) {
        produse.remove(produs);
    }

    public void modificareProdus(Produs produs, int cantitate) {

        for (Produs p : produse) {
            if (p.getNume().equals(produs.getNume())) {
                p.setCantitate(cantitate);
            }
        }
    }

    public Produs gasesteProdusul(String nume) {
        for (Produs p : produse) {
            if (p.getNume().equals(nume)) {
                return p;
            }
        }
        return null;
    }
}
