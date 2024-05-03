public class TransactionService {
    private final int N=10;
    private Transaction[] transactions=new Transaction[N];
    private int nbreTransaction;

    public boolean addTransaction(Transaction transaction){
        if (nbreTransaction<N) {
            transactions[nbreTransaction++]=transaction;
            return true;
        }
        return false;
    }

    public void showTransaction(){
        for (int index = 0; index < nbreTransaction; index++) {
               System.out.println(transactions[index].toString());
        }
    }

    public void showTransaction(TypeTransaction type){
        for (int index = 0; index < nbreTransaction; index++) {
            if (type==transactions[index].getType()) {
                  System.out.println(transactions[index].toString());
            }
              
        }
    }
}
