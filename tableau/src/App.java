import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
        //type nomTableau[]=new type[NbreCellule] ==>Tableau est un objet
           //Type primitifs(int,double,float,boolean)
   
           int t[]=new int[5]; //0
           Scanner scanner=new Scanner(System.in);
           for (int index = 0; index < 3; index++) {
               System.out.println("Entrer une valeur");
               t[index]=scanner.nextInt();
             
           }
             for (int x : t) {
                if (x!=0) {
                    System.out.println(x);
                }
                
            }

           /* double t1[]=new double[5];//0
           for (int index = 0; index < t1.length; index++) {
              System.out.println(t1[index]);
            }
           boolean t2[]=new boolean[5];//false
          for (boolean elt : t2) {
              System.out.println(elt);
          }
         
        
          String t3[]=new String[5];//null
          for (int index = 0; index < 5; index++) {
              System.out.println(t3[index]);
           } */
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
