// package Assign4A;
import java.util.*;
class IntegerArray{
    private int[] data;

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        data = new int[5];
        for(int i=0;i<5;i++) data[i] = sc.nextInt();
        sc.close();
    }
    public void bubbleSort(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        //check for duplicates
        boolean flag = false;
        for(int i=1;i<5;i++){
            if(data[i] == data[i-1]){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("INVALID INPUT");
        }
        else{
            for(int i=0;i<5;i++) System.out.print(data[i]+" ");
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        IntegerArray obj = new IntegerArray();
        obj.inputData();
        obj.bubbleSort();
    }
}
