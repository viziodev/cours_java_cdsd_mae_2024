package services;

import entity.Client;
import entity.Zone;

public class ClientService {
    private static final int N=10;
    private static Client[] tclient=new Client[N];
    private static int taille=0;
    /**
     *  Ajouter un Client(id,nomComplet,téléphone,zone(Nord,EST,OUEST,SUD)) dans le Tableau
        Lister tous les clients du Tableau
        Lister  les clients du Tableau Par Zone
     */
   
    public static  boolean creerClient(Client client)
     {
      if(taille<N){
        tclient[taille] =client;
        taille=taille+1;
         return true;
        }
        return false;
    }
    public static String  listerClient()
    {
        String result; 
        result="";
        for(int i=0;i<taille;i=i+1) {
            result=result + tclient[i].toString();
        }
        return result;
    }

    public static String  listerClient(Zone zone)
    {
        String result; 
        result="";
        for(int i=0;i<taille;i=i+1) {
            if (tclient[i].getZone()==zone) {
                result=result + tclient[i].toString()+"\n"; 
            }
           
        }
        return result;
    }

    public static Client rechercherUnClientParTel(String tel){
           for(int i=0;i<taille;i=i+1) {
              /**
               * String ch="Bonjour";
               * String ch1="Au revoir";
               * ch.compareTo("Bonjour") ==0
               * ch.compareTo(ch1) ==>10  ==> ch est identique a ch1 donc la methode  compareTo retourne 0
               * ch.compareTo(ch1)  ==> ch n'est pas identique  a ch1 donc la methode  compareTo retourne !0
               */
               if(tclient[i].getTelephone().compareTo(tel)==0){
                  return tclient[i];
               }
            }
              return null;
        }



}
