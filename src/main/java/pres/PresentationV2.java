package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //start- equivalent de : DaoImpl d=new DaoImpl();
            String daoClassname = scanner.nextLine(); // Donner le nom de la classe
            /*Chargement en memoire ss forme d'un objet de type class */
            Class cDao = Class.forName(daoClassname);// chercher la classe si elle existe et charge la en memoire
            IDao dao= (IDao) cDao.getConstructor().newInstance(); // Creer un objet de cette classe
            //end-

            //start- equivalent de MetierImpl metier = new MetierImpl(d);
            String metierClassname = scanner.nextLine();
            Class cMetier=Class.forName(metierClassname);
            IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            //end-


            System.out.println("Res="+ metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
