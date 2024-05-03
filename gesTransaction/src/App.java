import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner=new Scanner(System.in);
      TransactionService transactionService=new TransactionService();
      int choix;
      do {
             System.out.println("1-Ajouter une Transaction dans le Tableau"); 
             System.out.println("2-Lister toutes Transactions du Tableau"); 
             System.out.println("3-Lister les Transactions du Tableau Par Type"); 
             System.out.println("4-Quitter"); 
             choix=scanner.nextInt();
            
             switch (choix) {
                case 1:
                    Transaction transaction=new Transaction();
                    int type;
                      System.out.println("Entrer l'id de la Transaction");
                      transaction.setId(scanner.nextInt());
                      System.out.println("Entrer le Montant de le Transaction");
                      transaction.setMontant(scanner.nextDouble());
                      do {
                          System.out.println("1-Depot");
                          System.out.println("2-Retrait");
                          type=scanner.nextInt();
                      } while (type<1 || type>2);
                       if (type==1) {
                         transaction.setType(TypeTransaction.Depot);
                       }else{
                         transaction.setType(TypeTransaction.Retrait);
                       }
                       transactionService.addTransaction(transaction);
                break;
                case 2:
                    transactionService.showTransaction();
                break;

                case 3:
                do {
                    System.out.println("1-Depot");
                    System.out.println("2-Retrait");
                    type=scanner.nextInt();
                } while (type<1 || type>2);
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
}
