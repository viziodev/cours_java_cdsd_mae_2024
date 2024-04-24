import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner scanner=new Scanner(System.in);
          int choix;
           Caculatrice caculatrice=new Caculatrice();
           Saisie saisie=new Saisie();
           do {
                choix=saisie.menu();
               if (choix>=1 && choix<=3) {
                  caculatrice.setNbre1(saisie.saisieNbre());
                  caculatrice.setNbre2(saisie.saisieNbre());
                  saisie.afficheResult(choix, caculatrice);
               }
           } while (choix!=4);


          scanner.close();

          //Porte ou visibilite des variables ==>block
          
    }


    
}
