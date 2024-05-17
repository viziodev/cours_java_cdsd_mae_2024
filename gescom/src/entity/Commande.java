package entity;

import java.time.LocalDate;

public class Commande {
    private static int nbre;
    private int id;
    private LocalDate date;
    private double montant;
    private Statut statut;
     //Attributs Navigables ⇒ Attributs issus des relations
     //ManyToOne⇒ Plusieurs commandes associés à un client
     private Client client;
     public Client getClient() {
        return client;
     }
     public void setClient(Client client) {
        this.client = client;
     }
    public Commande() {
        nbre++;
        id=nbre;
    }
    public Commande(LocalDate date, double montant) {
        nbre++;
        id=nbre;
        this.date = date;
        this.montant = montant;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }

    
    @Override
    public String toString() {
        return "Commande [id=" + id + ", date=" + date + ", montant=" + montant + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        long temp;
        temp = Double.doubleToLongBits(montant);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Commande other = (Commande) obj;
        if (id != other.id)
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
            return false;
        return true;
    }
    public static int getNbre() {
        return nbre;
    }
    public static void setNbre(int nbre) {
        Commande.nbre = nbre;
    }
    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }  

    
}
