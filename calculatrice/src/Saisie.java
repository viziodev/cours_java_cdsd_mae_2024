import java.util.Scanner;

public class Saisie {
    private Scanner scanner=new Scanner(System.in);
    public int menu(){
        System.out.println("1-Addition");
        System.out.println("2-Soustraction");
        System.out.println("3-Division");
        System.out.println("4-Quitter");
        return scanner.nextInt();
    }

    public double saisieNbre(){
        System.out.println("Entrer une Valeur");
        return scanner.nextDouble();
    }

    public void afficheResult(int choix,Caculatrice caculatrice){
        if (choix==1) {
            System.out.println("Somme :"+caculatrice.somme());
           }
          if (choix==2) {
          System.out.println("Soustraction :"+caculatrice.soustaction());
          }
          if (choix==3) {
             double result =caculatrice.division();
            if(result!=0){
                System.out.println("Division :"+result);
            }else{
               System.out.println("Erreur");
            }
         }
    }


    
}
