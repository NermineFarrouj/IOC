package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection par Instanciation statique
         */
        DaoImpl d=new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d); //Injection via setter
        System.out.println("resultat="+metier.calcul());
    }
}
