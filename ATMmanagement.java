package maven.ATMmanagement;

import java.util.Scanner;
class Creditamt
{
   double balanceAmount=0;
   void getAmount(double credit)
   {
       this.balanceAmount=balanceAmount+credit;    
    }
}  
class Debitamt extends Creditamt
{
    void putAmount(double debit){
        if(debit<=balanceAmount){
            balanceAmount-=debit;
            System.out.println("Withdrawn:$"+debit);
            System.out.println("Current Amount $"+balanceAmount);
        }
        else{
            System.out.println("Insufficient balance ,withdrawl failed!");
        }
    }
}
class Balance extends Debitamt
{
    void displayBalance(){
        System.out.println(this.balanceAmount);
    }
}

public class ATMmanagement{

    public static void main(String args[]) 
    {
        final int ATMpin=2609;
        int choice;
        double debit;
        double credit; 
         int getpin;
        //int PINnumber;
        Balance b = new Balance();
        Debitamt d= new Debitamt();
        Scanner z = new Scanner(System.in);
        System.out.println("Enter your PIN number");
        getpin=z.nextInt();
        
        if(getpin>=4)
        {
            System.out.println("Welcome USER!");
        }
        else{
            System.out.println("PIN number not matched !");
        }
        
        if(ATMpin==getpin)
        {
        do{
            System.out.println("1. Credit /n 2. Debit /n 3.Check Balance/n 4.Exit");
           System.out.println("Enter your choice?");
           choice=z.nextInt();
            switch(choice)
         {
            case 1 : 
                System.out.println("Enter your Amount to credit:");
                credit=z.nextInt();
                d.getAmount(credit);
                
            case 2:
                System.out.println("Enter your Amount to debit:");
                debit=z.nextInt();
                d.putAmount(debit);
                
            case 3:
                System.out.println(" Checking the balance Amount ");
                b.displayBalance();
                
            case 4: z.close();
         }
         } while(choice!=4);
        }
       }
}
        
   
    
    

