// package Assign4B;
import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter SBI customer details: ");
        String s = scn.nextLine();
        String[] str = s.split(" ");
        SBI sbi = new SBI();
        sbi.account_holder_name = str[0];
        sbi.balance = Double.parseDouble(str[1]);
        double credit = Double.parseDouble(str[2]);
        double debit = Double.parseDouble(str[3]);
        sbi.credit(credit);
        sbi.debit(debit);
        System.out.println("Enter HDFC customer details: ");
        HDFC hdfc = new HDFC();
        s = scn.nextLine();
        str = s.split(" ");
        hdfc.account_holder_name = str[0];
        hdfc.balance = Double.parseDouble(str[1]);
        credit = Double.parseDouble(str[2]);
        debit = Double.parseDouble(str[3]);
        hdfc.credit(credit);
        hdfc.debit(debit);
        System.out.printf("%s %d %d %s %d %d%n", sbi.account_holder_name, (int) sbi.balance, sbi.interest(), hdfc.account_holder_name, (int) hdfc.balance, hdfc.interest());
    }
}
class Account{
    String account_holder_name;
    double balance;

    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
        }
    }
}

class SBI extends Account{
    public int interest(){
        int i = (int) (balance * 0.05);
        return i;
    }
}
class HDFC extends Account{
    public int interest(){
        int i = (int) (balance * 0.06);
        return i;
    }
}
