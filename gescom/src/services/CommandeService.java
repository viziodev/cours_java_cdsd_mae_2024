package services;

import entity.Client;
import entity.Commande;
import entity.Statut;
import entity.Zone;

public class CommandeService {
     private static final int N=10;
      private static Commande [] tcmdes=new Commande[N];
      private static int taille;
    /**
     * Enregistrer une commande pour un client
       Lister toutes les Commandes
       Lister les Commande par Statut
     */

      public static  boolean creerCommande(Commande commande)
     {
      if(taille<N){
        tcmdes[taille] =commande;
        taille=taille+1;
         return true;
        }
        return false;
    }
    public static String  listerCommande()
    {
        String result; 
        result="";
        for(int i=0;i<taille;i=i+1) {
            result=result + tcmdes[i].toString();
        }
        return result;
    }

    public static String  listerCommande(Statut statut)
    {
        String result; 
        result="";
        for(int i=0;i<taille;i=i+1) {
            if (tcmdes[i].getStatut()==statut) {
                result=result + tcmdes[i].toString()+"\n"; 
            }
        }
        return result;
    }
}
