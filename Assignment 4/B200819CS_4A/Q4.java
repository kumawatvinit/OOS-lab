// package Assign4A;
import java.util.*;

class TelephoneCall{
    String phNo;
    String custName;
    int callSlots;
    int totalBill;

    public void readCustomer(){
        Scanner sc = new Scanner(System.in);
        custName = sc.nextLine();
        phNo = sc.nextLine();
        callSlots = sc.nextInt();
        sc.close();
    }
    public int computeBill(){
        if(callSlots<=100) {
            totalBill = 500;
        }
        else if(callSlots<=200){
            totalBill = callSlots*8;
        }
        else if(callSlots<=300){
            totalBill = callSlots*10;
        }
        else{
            totalBill = callSlots*15;
        }
        totalBill += 300;
        return totalBill;
    }
}
public class Q4 {
    public static void main(String[] args) {
        TelephoneCall obj = new TelephoneCall();
        obj.readCustomer();
        System.out.println(obj.computeBill());
    }
}
