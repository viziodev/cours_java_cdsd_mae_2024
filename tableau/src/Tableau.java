public class Tableau {
    //Definir une constante
    private final int N=10;
    //Attributs
    private int[] t1=new int[N];
    public int[] getT1() {
        return t1;
    }
    private int n1;
    public int getN1() {
        return n1;
    }

    private int[] t2=new int[N];
    private int n2;

    private int[] t3;
    private int n3;

   public Tableau(){
     //Attributs a initialises 
         t3=new int[N];
   }
   //pos ==> 0  =>1 
   //pos ==11
    public boolean  addTableau(int nbre){
           if(n1<N)  {
              t1[n1++]=nbre;
               return true;
           }
           return false;   
    }

   public void afficheTableau(int t[], int n){
        for (int index = 0; index < n; index++) {
              System.out.print(t[index]+" ");     
        }
        System.out.println("");
   }

   public void afficheTableauPair(){
    for (int index = 0; index < n1; index++) {
        if(t1[index]%2==0){
            System.out.print(t1[index]+" ");  
        }  
    }
      System.out.println("");
    }

        public void transfertPositif(){
            n2=0;
          for (int index = 0; index < n1; index++) {
            if(t1[index]>0){
                t2[n2++] =t1[index];
            }  
           }
           afficheTableau(t2,n2) ;
            System.out.println("");
        }
     //Portee des variables
       
     public boolean estPresent(int t[],int n,int val){
        for (int index = 0; index < n; index++) {
            if(t1[index]==val){
               return true;
            }  
         }
           return false;
      }

      public void transfertPositifSansDoublon(){
          n2=0;
        for (int index = 0; index < n1; index++) {
          if(t1[index]>0 && !estPresent(t2,n2,t1[index])){
              t2[n2++] =t1[index];
          }  
         }
         afficheTableau(t2,n2) ;
          System.out.println("");
      }
}
