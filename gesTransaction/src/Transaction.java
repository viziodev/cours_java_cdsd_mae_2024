public class Transaction {

    //Categorie Attribut
        //Attribut instance  ou Attribut d'objet (Par defaut)
           //attributs instance sont specifiques a un objet,zone memoire specique a objet 
           private int id;
           private double montant;
           private TypeTransaction type; 
        //Attribut statique ou Attribut de classe 
         //attribut statique est une zone memoire partage  a tous les objets de la classe
            private static int nbreTransaction; //0 ,1,2,3
            public static int getNbreTransaction() {
                return nbreTransaction;
            }

            //Attribut constant => final
            //Attribut  final instance
               private final int N=10;
           //Attribut  final instance
               private static  final int N1=10;

    public Transaction(int id, double montant, TypeTransaction type) {
        this.id = id;
        this.montant = montant;
        this.type = type;
    }

    public Transaction() {
          nbreTransaction++;
          id=nbreTransaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", montant=" + montant + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Transaction other = (Transaction) obj;
        if (id != other.id)
            return false;
        if (type != other.type)
            return false;
        return true;
    }

    
}
