public class savingAccount extends account {
    private float tauxInteret;
    public savingAccount(int numeroClient,int numeroAccount, float solde, String dateOuverture, float tauxInteret) {
        super(numeroClient,numeroAccount,solde,dateOuverture);
        this.tauxInteret = tauxInteret;
    }
    public float getTauxInteret() {return tauxInteret;}

}
