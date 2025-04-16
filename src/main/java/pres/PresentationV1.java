package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection par Instanciation statique
         avec
        New = couplage fort = ouverte a la modification

        alternative : Instanciation dynamique -> config.txt = specifier le nom de la classe qu'on va utilise
        */
        DaoImpl d=new DaoImpl();
        MetierImpl metier = new MetierImpl(d); //via Argconstructeur
        //metier.setDao(d); //Injection via setter
        System.out.println("resultat="+metier.calcul());
    }
}
