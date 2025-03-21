package Presentation;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println(metier.calculate());



    }
}
