// package Assign8;
import java.util.*;

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String weather);
}

interface Observer {
    void update(String weather);
}

class WeatherStation implements Subject{
    private List<Observer> observers;

    public WeatherStation(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(String weather){
        for(Observer o : observers){
            o.update(weather);
        }
    }
}

class WeatherDisplay implements Observer{
    private String weather;

    public void update(String weather){
        this.weather = weather;
        display();
    }

    public void display(){
        System.out.println("Weather using Display is " + weather);
    }
}
class PhoneApp implements Observer{
    private String weather;

    public void update(String weather){
        this.weather = weather;
        display();
    }

    public void display(){
        System.out.println("Weather using PhoneApp is " + weather);
    }
}

public class Q2 {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        WeatherDisplay wd = new WeatherDisplay();
        PhoneApp pa = new PhoneApp();
        ws.registerObserver(wd);
        ws.registerObserver(pa);
        ws.notifyObservers("Sunny");
        ws.notifyObservers("Rainy");
    }
}
