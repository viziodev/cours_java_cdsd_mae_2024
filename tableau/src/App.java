import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
           Scanner scanner=new Scanner(System.in);
           int choix;
           Tableau tableau=new Tableau();  
           do {
               System.out.println("1-Ajouter un elt dans le tableau 1");
               System.out.println("2-Afficher le Tableau 1");
               System.out.println("3-Ajouter les  elts  Pairs du  tableau t1");
               System.out.println("4-Tranfert t2");
               System.out.println("5-Tranfert Sans doublons t2");
               System.out.println("6-Tranfert   communsSansDoublons");
               System.out.println("7-Tranfert communsTranfertSansDoublon");
               System.out.println("8-Quitter");
                choix=scanner.nextInt();
                    if (choix==1) {
                          System.out.println("Entrer une valeur");
                          int nbre=scanner.nextInt();
                          tableau.addTableau(nbre);

                    }
                    if (choix==2) {
                       
                        tableau.afficheTableau(tableau.getT1(),tableau.getN1());
                    }
                    if (choix==3) {
                        tableau.afficheTableauPair();
                    }
                    if (choix==4) {
                       tableau.transfertPositif();
                    }

                    if (choix==5) {
                        tableau.transfertPositifSansDoublon();
                     }

           } while (choix!=8);
             scanner.close();
          
             /*
              *  Classe Tableau
                   Attributs:
                     trois tableau entiers sous forme d'attribut
                  Methode:
                      saisieTableau()
                      afficheTableau()
                      afficheNbrePairTableau()
                      TransferTableau()  ==>  elt positif t1==>t2
                      TransferSansDoublons()  ==>  elt pairs t1==>t2
                      communsSansDoublons()  ==>  elt communs de t1 et t2
                      communsTranfertSansDoublons()  ==>  elt communs de t1 et t2 transferer dans t3

             */

           
    }
}
