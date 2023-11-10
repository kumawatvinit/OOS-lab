// package Assign7A;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class FileNotFoundException extends Exception{
    FileNotFoundException(String s){
        super(s);
    }
}
public class Q2 {
    //check if file exists
    void checkFile(String s) throws FileNotFoundException{
        File f = new File(s);
        if(!f.exists()){
            throw new FileNotFoundException("File Not Found");
        }
    }
    //read file into arraylist lines
    ArrayList<String> readFile(String s) throws Exception{
        return (ArrayList<String>) Files.readAllLines(Paths.get(s));
    }

    //check if in a line any non-numeric character is present
    void checkLine(String s) throws NumberFormatException{
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                throw new NumberFormatException("OtherCharactersFound");
            }
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Q2 obj = new Q2();
        String filename = scn.nextLine();
        filename = "src\\Assign7A\\"+filename;
        try{
            obj.checkFile(filename);
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
        ArrayList<String> lines = new ArrayList<>();
        try{
            lines = obj.readFile(filename);
        }
        catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
        for (String line : lines) {
            try {
                obj.checkLine(line);
                System.out.println(line);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
    }

}
