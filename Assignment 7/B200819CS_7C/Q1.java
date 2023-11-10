// package Assign7C;
import java.util.*;
class Logger{
    private static Logger logger;
    HashMap<Integer, String> logs = new HashMap<>();
    private Logger(){}
    public static Logger getInstance(){
        if(logger==null){
            logger = new Logger();
        }
        return logger;
    }
    public void addLog(int i, String s){
        logs.put(i,s);
    }
}
public class Q1 {
}
