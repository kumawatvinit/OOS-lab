// package Assign7A;
import java.util.*;


class IncorrectInputSizeException extends Exception{
    IncorrectInputSizeException(String s){
        super(s);
    }
}

public class Q4 {
    String decode(String firstByte, String remainingByte) throws IncorrectInputSizeException{
        if(remainingByte.length() % 8 != 0){
            throw new IncorrectInputSizeException("Incorrect Input Size");
        }
        String ans = "";
        int firstNum = Integer.parseInt(firstByte,2);
        for(int i=0;i<remainingByte.length();i+=8){
            String s = remainingByte.substring(i,i+8);
            //convert s to binary
            int num = Integer.parseInt(s,2);
            //xor with firstNum
            num = num ^ firstNum;
            //convert num to char
            char c = (char)num;
            //append to ans
            ans+=c;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String bits = scn.nextLine();
        String firstByte = bits.substring(0,8);
        String remainingBits = bits.substring(8);
        int size = remainingBits.length();
        Q4 obj = new Q4();
        try{
            System.out.println(obj.decode(firstByte,remainingBits));
        }
        catch(IncorrectInputSizeException e){
            System.out.println(e);
            System.exit(0);
        }
    }
}
