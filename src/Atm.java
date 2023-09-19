import java.util.Scanner;

public class Atm {
    float balance;
    final int pin=4321;
    public void checkPin(){
        System.out.println("Enter Your Pin");
        Scanner sc= new Scanner(System.in);
        int enterPin= sc.nextInt();
        if(enterPin==pin){
            System.out.println("login successfull");
            menu();
        }else{
            System.out.println("login failed");
        }
    }

    public void menu(){
        System.out.println("\t1. Check A/C Balance");
        System.out.println("\t2. Withdraw Money");
        System.out.println("\t3. Deposit Money");
        System.out.println("\t4. Exit");
        choose();
    }
    public void menu2(){
        System.out.println("\t1. Go to Menu");
        System.out.println("\t2. Exit");
        choose2();
    }
    public void choose(){
        System.out.print("Enter your choice: ");
        Scanner sc= new Scanner(System.in);
        int option= sc.nextInt();
        switch (option){
            case 1: checkBalance(); break;
            case 2: withDraw(); break;
            case 3: deposit(); break;
            case 4: return;
            default:System.out.println("Enter a Valid option"); menu();
        }
    }
    public void choose2(){
        System.out.print("Enter your choice: ");
        Scanner sc= new Scanner(System.in);
        int option2= sc.nextInt();
        switch (option2){
            case 1: menu(); break;
            case 2: return;
            default:System.out.println("Enter a Valid option"); menu2();
        }
    }
    public void checkBalance(){
        System.out.println(balance);
       menu2();

    }
    public void withDraw(){
        System.out.println("How Much you want to withdraw?");
        Scanner sc =new Scanner(System.in);
        float withdraw = sc.nextFloat();

        if(withdraw>balance){
            System.out.println("\ninsufficient Balance\n");

        }else{
            float temp = balance;
            balance-=withdraw;
            if(balance!=temp){
                System.out.println("\nSuccessfully withdraw "+withdraw+" Taka");
                System.out.println("Current Balance is "+balance+" Taka\n");
            }else{ System.out.println("\nNo amount is withdraw.\n");}
        }
        menu2();

    }
    public void deposit(){
        System.out.println("How Much you want to deposit?");
        Scanner sc =new Scanner(System.in);
        float dep = sc.nextFloat();
        float temp = balance;
        balance+=dep;
        if(balance!=temp){
            System.out.println("\nSuccessfully deposit "+dep+" Taka");
            System.out.println("Current Balance is "+balance+" Taka\n");
        }else{ System.out.println("\nNo amount is deposit.\n");}
        menu2();
    }



    public static void main(String[] args) {

        Atm atm1= new Atm();
        atm1.checkPin();
    }
}