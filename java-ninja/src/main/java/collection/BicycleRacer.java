package collection;

public class BicycleRacer {
    String name;
    int weight;
    int speedInMilesPerHour;
    double height;
    public BicycleRacer(String name,int weight,int speedInMilesPerHour, double height){
        this.name=name;
        this.weight=weight;
        this.speedInMilesPerHour=speedInMilesPerHour;
        this.height=height;
    }
    public static void main(String[] agrs){
        BicycleRacer racerA= new BicycleRacer("Rohan",60,30, 5.5);
        BicycleRacer racerB= new BicycleRacer("John",75,25,6.0);
        racerA.race1(racerB);
        racerA.race2(racerB);
    }
    public void race1(BicycleRacer b){
        if (b.speedInMilesPerHour>this.speedInMilesPerHour)
            System.out.println(b.name + " wins");
        else
            System.out.println(this.name +" wins");
    }

    public void race2(BicycleRacer c){
        if (this.speedInMilesPerHour>c.speedInMilesPerHour && this.weight<c.weight)
            System.out.println("Anything can happen");
        else if(this.speedInMilesPerHour>c.speedInMilesPerHour && this.weight>c.weight)
            System.out.println(c.name + " wins");
        else
            System.out.println(this.name + " wins");
    }
}
