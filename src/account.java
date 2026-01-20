public class account {
    private int numeroClient;
    private int numeroAccount;
    private float solde;
    private String dateOuverture;

    public account(int numeroClient ,int numeroAccount, float solde, String dateOuverture) {
        this.numeroClient = numeroClient;
        this.numeroAccount = numeroAccount;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
    }
    public void setSolde(float amount) {
        if (amount > 0){
            solde += amount;
        }else {
            System.out.println("Solde invalide");
        }
    }
    public void Setwithdrawing(float amount) {
        if(amount <= solde){
            solde-=amount;
        }else{
            System.out.println("Solde insufficiente");
        }
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public int getNumeroAccount() {return numeroAccount;}
    public float getSolde() {return solde;}
    public String getDateOuverture() {return dateOuverture;}
}
