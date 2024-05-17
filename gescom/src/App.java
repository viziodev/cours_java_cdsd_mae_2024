import java.time.LocalDate;
import java.util.Scanner;



import entity.Client;
import entity.Commande;
import entity.Statut;
import entity.Zone;
import services.ClientService;
import services.CommandeService;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
           int choix;
        do 
        {
             System.out.println("1-Ajouter un Client");
             System.out.println("2-Lister tous les clients du Tableau");
             System.out.println("3-Lister  les clients du Tableau Par Zone");
             System.out.println("4-Enregistrer une commande pour un client");
             System.out.println("5-Lister toutes les Commandes");
             System.out.println("6-Lister les Commandes d’un Client");
             System.out.println("7-Quitter");
             choix=scanner.nextInt();
             scanner.nextLine();
             if(choix==1)  {
                ClientService.creerClient(saisieClient());
             }
             if(choix==2)  {
                System.out.println (ClientService.listerClient()); 
             }
             if(choix==3)  {
                Zone zone=saisieZone();
                System.out.println (ClientService.listerClient(zone)) ; 

             }
             if(choix==4)  {
               Commande commande =saisieCommande();
               if (commande!=null) {
                    CommandeService.creerCommande(commande);
               }
             }
             if(choix==5)  {
                 System.out.println(CommandeService.listerCommande());
             }
             if(choix==6)  {
                System.out.println("Entrer telephone") ;
                String telephone=scanner.nextLine();
                Client client=ClientService.rechercherUnClientParTel(telephone);
                if(client==null){
                    System.out.println("Ce Client existe Pas");
                 }else{ 
                     System.out.println(client); 
                     for (Commande cmde : client.getTcmdes()) {
                        if (cmde!=null) {
                            System.out.println(cmde);  
                        }
                     }
                 }
             }
        }
       while(choix!=7);

    }   
    
    public  static Client saisieClient()             
     {
            Client client;
            String  nomComplet,telephone;
            Zone zone;
            System.out.println("Entrer Nom Complet") ;
             nomComplet=scanner.nextLine();
             System.out.println("Entrer telephone") ;
             telephone=scanner.nextLine();
            zone=saisieZone();
             client=new Client(nomComplet,telephone,zone);
             return client;
        }


    public  static Zone  saisieZone()
       {
           int choixZone;
            Zone zone=null;
            System.out.println("Entrer zone") ;
            System.out.println("1-Nord");
            System.out.println("2-Sud");
            System.out.println("3-Ouest");
            System.out.println("4-Est");
             choixZone=scanner.nextInt();
             if(choixZone==1) {
                zone=Zone.NORD;
             }
             if(choixZone==2) {
                zone=Zone.SUD;
             }
             if(choixZone==3) {
                zone=Zone.OUEST;
             }
             if(choixZone==4) {
                zone=Zone.EST;
             }       
          return zone;
        }

        public  static  Commande saisieCommande()          
        {
              String telephone; 
              double     montant;
              Client  client;
              Commande  commande;
    //1-Rechercher le Client de commande par Téléphone
             System.out.println("Entrer telephone") ;
                telephone=scanner.nextLine();
                client=ClientService.rechercherUnClientParTel(telephone);
             if(   client==null){
                System.out.println("Ce Client existe Pas");
                return null;
             }else{          
                  //2-Lorsque le client existe je saisie la commande et je l’associe à ce client
                   System.out.println("Entrer le montant  de la Commande") ;
                    montant=scanner.nextDouble();
                    commande=new Commande();
                    commande.setDate(LocalDate.now());
                    commande.setMontant(montant);
                    commande.setStatut(Statut.IMPAYER);
                   //Créer l’association
                       //Commande vers Client
                          commande.setClient(client);
                      //Client vers Commande
                          client.addCommande(commande);
               }

                 return  commande;
        }


}
