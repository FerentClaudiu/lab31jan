package Exercitiu1;

public class MagazinApp {
    public static void main(String[] args) {
        Cos cosCumparaturi = new Cos();
        Produs mere = new Produs("Mere",2);
        Produs pere = new Produs("Pere",5);
        Produs lapte = new Produs("Lapte",1);
        Produs cartofi = new Produs("Cartofi",3);

        cosCumparaturi.adaugareProduse(mere);
        cosCumparaturi.adaugareProduse(pere);
        cosCumparaturi.adaugareProduse(lapte);
        cosCumparaturi.adaugareProduse(cartofi);
        cosCumparaturi.adaugareProduse(cartofi);

        cosCumparaturi.afiseazaProduse();

        Produs cautaUnProdus= cosCumparaturi.gasesteProdusul("Cartofi");
        System.out.println("Ai cautat dupa produsul: "+cautaUnProdus.getNume()+"--->" + cautaUnProdus.getCantitate()+"kg");

        cosCumparaturi.stergeProdus(mere);
        System.out.println("Produsele dupa stergerea merelor: ");
        cosCumparaturi.afiseazaProduse();

        cosCumparaturi.modificareProdus(lapte,2);
        System.out.println("Produsele dupa modificare: ");
        cosCumparaturi.afiseazaProduse();
    }
}
