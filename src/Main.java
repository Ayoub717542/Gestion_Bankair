import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bank Bank= new bank("banc" ,"adresss");
        Scanner input = new Scanner(System.in);
        int choix;
        do {
        // Display menu
        System.out.println("===== Banque Management System =====");
        System.out.println("1. Ajouter Un Client ");
        System.out.println("2. Ajouter Un Account");
        System.out.println("3. Ajouter Un Saving Account");
        System.out.println("4. Afficher Accounts ");
        System.out.println("5. Afficher Clients");
        System.out.println("6. Afficher Saving Accounts");
        System.out.println("7. Afficher Solde");
        System.out.println("8. Déposer de l’argent");
        System.out.println("9. Déposer de l’argent Compte d'épargne");
        System.out.println("10. Retirer de l’argent ");
        System.out.println("11. Retirer de Saving Account l’argent ");
        System.out.println("12. Supprimer un compte ");
        System.out.println("13. Calulate Saving Account intereset ");
        System.out.println("14. Exit");
        System.out.print("Enter your choice: ");
        choix = input.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Enter Client Nom: ");
                    String Nom = input.next();
                    System.out.print("Enter Client Prenom: ");
                    String Prenom = input.next();
                    System.out.print("Enter Client DateNaissence: ");
                    String DateNaissence = input.next();
                    System.out.print("Enter Client Email: ");
                    String Email = input.next();
                    System.out.print("Enter Client Numero: ");
                    int Nclient = input.nextInt();
                    System.out.print("Enter Client Sold: ");
                    float Sold = input.nextFloat();
                    client client = new client (Nom,Prenom,DateNaissence,Email,Nclient,Sold);
                    Bank.addClient(client);
                    break;
                case 2:
                    System.out.print("Numero du client: ");
                    int numClient = input.nextInt();
                    System.out.println("Enter Account Numero :");
                    int Numero = input.nextInt();
                    System.out.println("Enter Account Sold :");
                    float Sold2 =input.nextFloat();
                    System.out.println("Enter date Ouverture :");
                    String DateOuverture = input.next();
                    account Account = new account(numClient,Numero,Sold2,DateOuverture);
                    Bank.addAccount(Account);
                    break;
                case 3:
                    System.out.print("Numero du client: ");
                    int numClientt = input.nextInt();
                    System.out.println("Enter Saving Account Numero :");
                    int SaccountN = input.nextInt();
                    System.out.println("Enter Account Sold :");
                    float SavingAcountSold =input.nextFloat();
                    System.out.println("Enter date Ouverture :");
                    String SavingAcountDateOuverture = input.next();
                    System.out.println("Enter taux Interet :");
                    float tauxInteret = input.nextFloat();
                    savingAccount SavingAccount = new savingAccount(numClientt,SaccountN,SavingAcountSold,SavingAcountDateOuverture,tauxInteret );
                    Bank.AddSavingsAccount(SavingAccount);
                    break;
                case 4:
                    Bank.displayAccounts();
                    break;
                case 5:
                    Bank.displayClients();
                    break;
                case 6:
                    Bank.displaySavingAcounts();
                case 7:
                    System.out.println("Enter Account Number :");
                    int AcountNumber = input.nextInt();
                    Bank.displaySolde(AcountNumber);
                    break;
                case 8:
                    System.out.println("Enter Account Number :");
                    int SubmitMoneyAcountNumber = input.nextInt();
                    System.out.println("Entrez combien d'argent vous voulez soumettre :");
                    float SubmitMoneyMontant = input.nextFloat();
                    Bank.SubmitMoney(SubmitMoneyAcountNumber,SubmitMoneyMontant);
                    break;
                case 9:
                    System.out.println("Enter Saving Account Number :");
                    int SubmitMoney=input.nextInt();
                    System.out.println("Entrez combient d'argent vous voulez soumettre :");
                    float montant=input.nextFloat();
                    Bank.SubmitMoneySavingAccount(SubmitMoney,montant);
                case 10:
                    System.out.println("Enter Account Number :");
                    int WithdrawingAcountNumber = input.nextInt();
                    System.out.println("Entrez le montant que vous souhaitez retirer :");
                    float WithdrawingMontant = input.nextFloat();
                    Bank.Withdrawing(WithdrawingAcountNumber,WithdrawingMontant);
                    break;
                case 11:
                    System.out.println("Enter Account Number :");
                    int SavingAccountNumber = input.nextInt();
                    System.out.println("Entrez le montant que vous souhaitez retirer :");
                    float SavingMontant = input.nextFloat();
                    Bank.WithdrawingSaving(SavingAccountNumber,SavingMontant);
                    break;
                case 12:
                    System.out.println("Enter Account Number :");
                    int numberAccount=input.nextInt();
                    Bank.DeleteAccount(numberAccount);
                case 13:
                    System.out.println("Enter Saving Account Number :");
                    int numberSavingAccount=input.nextInt();
                    Bank.calculateInterest(numberSavingAccount);
                case 14:
                    break;
                default:
                    System.out.println("Invalid choice!.");
            }
            System.out.println();
        } while (choix != 0);
        input.close();
    }
    }
