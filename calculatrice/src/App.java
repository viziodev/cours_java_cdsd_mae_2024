import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner scanner=new Scanner(System.in);
          int choix;
          double nbre1,nbre2;
           do {
               System.out.println("1-Addition");
               System.out.println("2-Soustraction");
               System.out.println("3-Division");
               System.out.println("4-Quitter");
               choix=scanner.nextInt();
               
               if (choix>=1 && choix<=3) {
                  System.out.println("Entrer une Valeur");
                  nbre1=scanner.nextDouble();
                  System.out.println("Entrer une Valeur");
                  nbre2=scanner.nextDouble();

                  if (choix==1) {
                    System.out.println("Somme :"+(nbre1+nbre2));
                 }
                 if (choix==2) {
                  System.out.println("Soustraction :"+(nbre1-nbre2));
                 }
                 if (choix==3) {
                    if(nbre2!=0){
                      System.out.println("Division :"+(nbre1/nbre2));
                    }else{
                     System.out.println("Erreur");
                    }
                 }
               }
              
              
                 
           } while (choix!=4);


          scanner.close();

          //Porte ou visibilite des variables ==>block
          
    }


    
}
