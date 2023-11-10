import java.util.*;

class Customer{
    String customerName;
    String accountNo;
    double currentBalance;

    Customer(String customerName, String accountNo, double currentBalance){
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.currentBalance = currentBalance;
    }
    void availableBalance(){
        System.out.println(customerName+":"+currentBalance);
    }
}
class SilverMembership extends Customer{
    double interestRate = 0.05;

    SilverMembership(String customerName, String accountNo, double currentBalance){
        super(customerName, accountNo, currentBalance);
    }
    void availableBalance(){
        double predicted = currentBalance*(1+interestRate);
        String s = String.format("%s:%.0f:Silver:%.0f", customerName, currentBalance, predicted);
        System.out.println(s);
    }
}
class GoldMembership extends Customer{
    double interestRate = 0.1;

    GoldMembership(String customerName, String accountNo, double currentBalance){
        super(customerName, accountNo, currentBalance);
    }
    void availableBalance(){
        double predicted = currentBalance*(1+interestRate);
        String s = String.format("%s:%.0f:Gold:%.0f", customerName, currentBalance, predicted);
        System.out.println(s);
    }
}

class PlatinumMembership extends Customer{
    double interestRate = 0.15;

    PlatinumMembership(String customerName, String accountNo, double currentBalance){
        super(customerName, accountNo, currentBalance);
    }
    void availableBalance(){
        double predicted = currentBalance*(1+interestRate);
        String s = String.format("%s:%.0f:Platinum:%.0f", customerName, currentBalance, predicted);
        System.out.println(s);
    }
}
public class Q4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Customer[] customers = new Customer[n];
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            String[] arr = s.split(":");
            String customerName = arr[0];
            String accountNo = arr[1];
            double currentBalance = Double.parseDouble(arr[2]);
            if(currentBalance < 100000){
                customers[i] = new SilverMembership(customerName, accountNo, currentBalance);
            }
            else if(currentBalance < 1000000){
                customers[i] = new GoldMembership(customerName, accountNo, currentBalance);
            }
            else{
                customers[i] = new PlatinumMembership(customerName, accountNo, currentBalance);
            }
        }
        for(Customer c : customers) c.availableBalance();
    }
}
