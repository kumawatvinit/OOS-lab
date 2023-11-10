// package Assign8;
import java.util.*;

interface Character{
    void getName();
    void getAbilities();
}

class Warrior implements Character{
    String name;
    List<String> abilities;

    public Warrior(String name, List<String> abilities){
        this.name = name;
        this.abilities = abilities;
    }

    public void getName(){
        System.out.println("Name: " + name);
    }

    public void getAbilities(){
        System.out.println("Abilities: " + abilities);
    }
}

class Mage implements Character{
    String name;
    List<String> abilities;

    public Mage(String name, List<String> abilities){
        this.name = name;
        this.abilities = abilities;
    }

    public void getName(){
        System.out.println("Name: " + name);
    }

    public void getAbilities(){
        System.out.println("Abilities: " + abilities);
    }
}

class CharacterFactory{
    public static Character createCharacter(String type, String name, List<String> abilities){
        if(type.equals("Warrior")){
            return new Warrior(name, abilities);
        }
        else if(type.equals("Mage")){
            return new Mage(name, abilities);
        }
        else{
            return null;
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        List<String> abilities = new ArrayList<String>();
        abilities.add("Petrify");
        abilities.add("Scream");
        Character mage = CharacterFactory.createCharacter("Mage", "Medusa", abilities);
        mage.getName();
        mage.getAbilities();

        abilities = new ArrayList<String>();
        abilities.add("Tsunami");
        abilities.add("Earthquake");
        Character warrior = CharacterFactory.createCharacter("Warrior", "Hercules", abilities);
        warrior.getName();
        warrior.getAbilities();
    }
}
