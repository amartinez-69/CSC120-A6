/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nCreams, int nCups, int nSugarPackets) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nCreams = 100;
        this.nCups = 100;
        this.nSugarPackets = 100;
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces >= size){
            this.nCoffeeOunces -= size;
        }
        if (this.nCreams >= nCreams){
            this.nCreams -= nCreams;
        }
        if (this.nSugarPackets >= nSugarPackets){
            this.nSugarPackets -= nSugarPackets;
        }
        if (this.nCups != 0){
            this.nCups -= 1;
        }
        else {
            restock(100, 100, 100, 100);
        } 
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 100; 
    }
    
    //public static void main(String[] args) {
        //new Cafe();
    //}
    
}
