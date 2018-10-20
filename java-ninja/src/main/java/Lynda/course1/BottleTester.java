package Lynda.course1;

public class BottleTester {

    public static void main(String[] args) {
        Bottle b1 = new Bottle("new", "blue", 1);
        Bottle b2 = new Bottle("old", "red", 2);
        Bottle temp = b1.fight(b2);
        System.out.println("winner is " + temp.getName());

        MedicineBottle mb = new MedicineBottle("crocin");
        BeerBottle bb = new BeerBottle();
        System.out.println(mb.fight(bb));
    }

}
