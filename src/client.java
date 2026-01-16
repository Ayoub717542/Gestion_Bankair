
    public class client extends personne
    {
        private int numeroClient;
        private float solde;

        public client( String nome, String prenom, String dateNaissance, String email,int numeroClient, float solde) {
            super(nome,prenom,dateNaissance,email);
            this.numeroClient = numeroClient;
            this.solde = solde;
        }
        public int getNumeroClient() {return numeroClient;}
        public float getSolde() {return solde;}
    }

