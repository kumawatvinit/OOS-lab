import java.util.*;

class Car{
    String modelName;
    String engineNo;
    double basePrice;
    double additionalCharge;

    Car(String modelName, String engineNo, double basePrice, double additionalCharge){
        this.modelName = modelName;
        this.engineNo = engineNo;
        this.basePrice = basePrice;
        this.additionalCharge = additionalCharge;
    }
    double totalPrice(){
        return basePrice + additionalCharge;
    }
}
class Dealer{
    String dealerName;
    int discountPercentage;
    Car car;

    Dealer(String dealerName, int discountPercentage, Car car){
        this.dealerName = dealerName;
        this.discountPercentage = discountPercentage;
        this.car = car;
    }
    double onRoadPrice(){
        double price = car.totalPrice();
        double discount = price * discountPercentage / 100;
        return price - discount;
    }
}
public class Q5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Dealer[] dealers = new Dealer[n];
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            String[] arr = s.split(" ");
            String modelName = arr[0];
            String engineNo = arr[1];
            double basePrice = Double.parseDouble(arr[2]);
            double additionalCharge = Double.parseDouble(arr[3]);
            Car car = new Car(modelName, engineNo, basePrice, additionalCharge);
            String dealerName = arr[4];
            int discountPercentage = Integer.parseInt(arr[5]);
            dealers[i] = new Dealer(dealerName, discountPercentage, car);
        }
        for(Dealer d : dealers)
            System.out.printf("%s %.0f %.0f%n", d.car.modelName, d.car.totalPrice(), d.onRoadPrice());

    }
}
