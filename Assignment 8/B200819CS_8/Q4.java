// package Assign8;

interface Bouquet{
    void getDescription();
}

class BasicBouquet implements Bouquet{
    public void getDescription(){
        System.out.println("Basic Bouquet");
    }
}

abstract class BouquetDecorator implements Bouquet{
    protected Bouquet bouquet;
    public BouquetDecorator(Bouquet bouquet){
        this.bouquet = bouquet;
    }
    public void getDescription(){
        bouquet.getDescription();
    }
}

class RibbonDecorator extends BouquetDecorator{
    public RibbonDecorator(Bouquet bouquet){
        super(bouquet);
    }
    public void getDescription(){
        bouquet.getDescription();
        System.out.println("Ribbon");
    }
}

class FragranceDecorator extends BouquetDecorator{
    public FragranceDecorator(Bouquet bouquet){
        super(bouquet);
    }
    public void getDescription(){
        bouquet.getDescription();
        System.out.println("Fragrance");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Bouquet bouquet = new BasicBouquet();
        Bouquet ribbonBouquet = new RibbonDecorator(bouquet);
        Bouquet fragranceBouquet = new FragranceDecorator(ribbonBouquet);
        fragranceBouquet.getDescription();
    }
}
