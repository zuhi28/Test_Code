package collection;

public class CarExample {
    String brand;
    int plateNumber;
    String colour;
    int mileage;
    public CarExample(String brand, int plateNumber,String colour, int milage){
        this.brand=brand;
        this.plateNumber=plateNumber;
        this.colour=colour;
        this.mileage =milage;
    }

     public static void main(String[] args){
         CarExample redCar = new CarExample("Toyta",2249,"Red",425);
         CarExample blueCar = new CarExample("Ferari",1124,"Blue",912);
         redCar.carFight(blueCar);
         setColour(blueCar);
         setColour(redCar);
         redCar.mileageRace(blueCar);
     }

    public void carFight(CarExample c){
        if (c.plateNumber>this.plateNumber)
            System.out.println(c.brand + " wins");
        else
            System.out.println(this.brand + " wins");
    }

    public static void setColour(CarExample d) {
        if (d.colour == "Red")
            System.out.println("The car is Red");
        else
            System.out.println("The car is Blue");
    }
    public void mileageRace(CarExample e){
        if (e.mileage>this.mileage)
            System.out.println(e.brand + " wins, as it has greater mileage");
        else
            System.out.println(this.brand + " wins, as it has greater mileage");
    }
}
