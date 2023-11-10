// package Assign4A;
import java.util.*;
public class Q2 {
    public int find(List<Integer> array) {
        int count = 0;
        Set<List<Integer>> set = new HashSet<>();
        Set<Integer> arraySet = new HashSet<>();
        //convert array to set
        for (Integer integer : array) {
            arraySet.add(integer);
        }
        for(int i=0;i<array.size();i++){
            for(int j=i+1;j<array.size();j++){
                int sum = array.get(i) + array.get(j);
                if(arraySet.contains(sum)){
                    List<Integer> list = new ArrayList<>();
                    list.add(array.get(i));
                    list.add(array.get(j));
                    Collections.sort(list);
                    set.add(list);
                }
            }
        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> array = new ArrayList<>();
        for(int i=0;i<n;i++) array.add(sc.nextInt());
        System.out.println(obj.find(array));
        sc.close();
    }
}
