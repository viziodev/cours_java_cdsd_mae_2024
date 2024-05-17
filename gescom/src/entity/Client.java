package entity;

public class Client {
    private static  int nbreClient;
    private  int id;
    private  String nomComplet;
    private  String telephone;
    private  Zone zone;
  //Attributs Navigables ⇒ Attributs issus des relations
      private static final int N=10;
      //OneToMany⇒ un client associés  à Plusieurs commandes 
      private Commande [] tcmdes=new Commande[N];
      private int taille;
      public Commande[] getTcmdes() {
        return tcmdes;
      }
      public boolean addCommande(Commande commande)
      {
            if(taille<N){
                tcmdes[taille] =commande;
              taille=taille+1;
               return true;
              }
              return false;
      }
     public Client() {
       nbreClient++;
       id=nbreClient;
      }
    public void setId(int id) {
        this.id = id;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    
    public Client(String nomComplet, String telephone, Zone zone) {
         nbreClient++;
         id=nbreClient;
         this.nomComplet = nomComplet;
         this.telephone = telephone;
        this.zone = zone;
    }
    public int getId() {
        return id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public String getTelephone() {
        return telephone;
    }
    public Zone getZone() {
        return zone;
    }
    //affiche
    @Override
    public String toString() {
        return "Client [id=" + id + ", nomComplet=" + nomComplet + ", telephone=" + telephone + ", zone=" + zone + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
        result = prime * result + ((zone == null) ? 0 : zone.hashCode());
        return result;
    }
    //egal
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (id != other.id)
            return false;
        if (telephone == null) {
            if (other.telephone != null)
                return false;
        } else if (!telephone.equals(other.telephone))
            return false;
        if (zone != other.zone)
            return false;
        return true;
    }
    public static int getNbreClient() {
        return nbreClient;
    }
    public static void setNbreClient(int nbreClient) {
        Client.nbreClient = nbreClient;
    }

    
    //Methodes
    
}
