import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class bank {
    private String nome;
    private String adresse;
    ArrayList<account>accounts;
    ArrayList<client>clients;
    ArrayList<savingAccount> savingAccounts;

    public bank(String nome, String adresse) {
        this.nome = nome;
        this.adresse = adresse;
        accounts=new ArrayList<>();
        clients = new ArrayList<>();
        this.savingAccounts = new ArrayList<>();
    }
    public String getNome() {return nome;}
    public String getAdresse() {return adresse;}
    public List<account> getAccounts() {return accounts;}

    public void addClient(client c) {
        clients.add(c);
        System.out.println("Ajouté avec succès");
    }
    public void displayClients(){
        for (client c : clients){
            System.out.println("Client Numero : " +c.getNumeroClient());
            System.out.println("Client Nome : " +c.getNome() );
            System.out.println("Client Prenom : " +c.getPrenom() );
            System.out.println("Client Date naissance : " +c.getDateNaissance() );
            System.out.println("Client Email : " +c.getEmail() );
        }
    }
    public void addAccount(account a) {
        for(client c : clients){
            if(c.getNumeroClient()==a.getNumeroClient()){
                accounts.add(a);
                System.out.println("Ajouté avec succès");
                return;
            }
            System.out.println("\u001B[31m ERROR Ce client n'est pas déjà dans le système \u001B[0m");
        }
    }
    public void displayAccounts(){
        System.out.println("========== Des Compte ==============");
        for (account a : accounts){
            client ClientAccount=null;
            for(client c : clients){
                if(c.getNumeroClient()==a.getNumeroClient()){
                    ClientAccount=c;
                    break;
                }
            }
            System.out.println("=========== Account Infoes ==============");
            System.out.println("Account Numero : " + a.getNumeroAccount());
            System.out.println("Date ouverture : " + a.getDateOuverture());
            System.out.println("Solde : " + a.getSolde());

            System.out.println("============= Client Infoes ==============");

            if(ClientAccount!=null){
                System.out.println("Client Nom : "+ClientAccount.getNome()+"\n"
                        + "Client Prenom : " + ClientAccount.getPrenom()+"\n"
                        + "Client Numero : " + ClientAccount.getNumeroClient());
            }else {
                System.out.println("Client : INTROVABLE");
            }
    }
        System.out.println("========== Des Compte d'épargne ==============");
        for(savingAccount s: savingAccounts){
            System.out.println("Client Numero : " +s.getNumeroClient());
            System.out.println("Account Numero: "+s.getNumeroAccount());
            System.out.println("Account Sold :"+s.getSolde());
        }
    }
   public void AddSavingsAccount(savingAccount a){
        for(client c : clients){
            if(c.getNumeroClient()==a.getNumeroClient()){
                savingAccounts.add(a);
                System.out.println("Ajouté avec succès");
                return;
            }
        }
       System.out.println("\u001B[31m ERROR Ce client n'est pas déjà dans le système \u001B[0m");
   }
   public void displaySavingAcounts(){
        for(savingAccount a : savingAccounts){
            System.out.println("Account Number : "+a.getNumeroAccount());
            System.out.println("Account Solde : "+a.getSolde());
            System.out.println("Date ouverture : "+a.getDateOuverture());
            System.out.println("taux Interet : "+a.getTauxInteret());
        }
   }
   public void SubmitMoneySavingAccount(int SaccountNumber,float amount){
        for(savingAccount s : savingAccounts){
            if(s.getNumeroAccount() == SaccountNumber){
                s.setSolde(amount);
             }}
   }
    public float calculateInterest(int accNumber){
        float interest = 0F;
        for(savingAccount s : savingAccounts){
            if(s.getNumeroAccount()==accNumber){
                interest = s.getSolde()*s.getTauxInteret()/100;
                s.setSolde(s.getSolde()+interest);
            }
                System.out.println("nouveau solde est ... "+s.getSolde() +"DH");
        }
        return interest;
    }
    public void displaySolde(int Account_number){
        for (account a : accounts){
            if(a.getNumeroAccount()==Account_number){
                System.out.println("solde d’un compte bancaire '"+Account_number+"' : "+a.getSolde()+" DH");
                break;
            } else {
                System.out.println("Compte non trouvé");
            }}}

    public void SubmitMoney(int Account_number,float amount){
        for (account a : accounts){
            if(a.getNumeroAccount()==Account_number){
               a.setSolde(amount);
            }
        }
        System.out.println("Ajouté '"+amount+" DH' avec succès");

    }
    public void Withdrawing(int Account_number, float amount){
        for(account a : accounts){
            if(a.getNumeroAccount()==Account_number){
               a.Setwithdrawing(amount);
            }
        }
        System.out.println("Retrait '"+amount+" DH' réussi");
    }
    public void WithdrawingSaving(int Account_number , float amount){
        for (savingAccount a : savingAccounts){
            if(a.getNumeroAccount()== Account_number){
                a.Setwithdrawing(amount);
            }
        }System.out.println("Retrait '"+amount+" DH' réussi");
    }
    public void DeleteAccount(int Account_number){
        account Account = null;
        for(account a : accounts){
            if(a.getNumeroAccount()==Account_number){
                    Account= a;
                    break;
            }
        }
       if(Account!=null){
           accounts.remove(Account);
           System.out.println("Compte supprimé.");
       }
}
}
