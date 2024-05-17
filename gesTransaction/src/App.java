import java.util.Scanner;

public class App {
     private static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      
      TransactionService transactionService=new TransactionService();
      int choix,type;
      do {
               choix=menu();
             switch (choix) {
                case 1:
                       transactionService.addTransaction(saisieTransaction());
                break;
                case 2:
                    transactionService.showTransaction();
                break;

                case 3:
                    type= saisieTypeTransaction();
                   if (type==1) {
                      transactionService.showTransaction(TypeTransaction.Depot);
                   }else{
                      transactionService.showTransaction(TypeTransaction.Retrait);
                    }
                break;

                default:
                    break;
             }
      } while (choix!=4);
    }

   public  static int menu(){
        System.out.println("1-Ajouter une Transaction dans le Tableau"); 
        System.out.println("2-Lister toutes Transactions du Tableau"); 
        System.out.println("3-Lister les Transactions du Tableau Par Type"); 
        System.out.println("4-Quitter"); 
        return scanner.nextInt();
    }

    public  static int saisieTypeTransaction(){
        int type;
        do {
            System.out.println("1-Depot");
            System.out.println("2-Retrait");
            type=scanner.nextInt();
        } while (type<1 || type>2);
        return type;
    }

    public static Transaction saisieTransaction(){
                     Transaction transaction=new Transaction();
                    int type;
                      System.out.println("Entrer le Montant de le Transaction");
                      transaction.setMontant(scanner.nextDouble());
                        type= saisieTypeTransaction();
                       if (type==1) {
                         transaction.setType(TypeTransaction.Depot);
                       }else{
                         transaction.setType(TypeTransaction.Retrait);
                       }
        return transaction;
    }
}
