package collection;

import Lynda.course1.Bottle;

public class Test {

	public static void main(String[] args) {

Bottle b3 = new Bottle ("Mujulloo", "black", 3);
Bottle b4 = new Bottle ("ramu", "orange", 3);
Bottle winner = b3.fight(b4);

if(winner == null) 
	System.out.println("DRAW");
else
System.out.print("And the winner is "+winner.getName());
//int[] Comp = new int[1];
int[] Comp= {3,4};
for(int i=0; i<Comp.length; i++) {
	if(Comp[i] == 4 || Comp[i] == 7)
		System.out.println("TRUE");
}
	
	/*char[] original = {'m' , 'o' , 'n' , 'd' , 'a' , 'y'};
    for(int k=original.length -1; k>=0; k--){
        System.out.print(original[k]);
}
*/
//numberOfCharOcc();
swappingWithOutTmp();
}

	private static void swappingWithOutTmp() {
		int a = 21;
		int b = 44;
		a = a+b;
		b =a-b;
		a =a -b;
		System.out.print(a + " " + b);
		
		
	}

	private static void numberOfCharOcc() {
		String str = "Natasha";
		int n =0;
		for(int i=0; i< str.length(); i++) {
			for(int k=0; k<str.length(); k++) {
				if(str.charAt(i) == str.charAt(k)) {
					n = n+1;
				}
			}
			if(n>1) {
			System.out.println(str.charAt(i) + " letter is duplicated and number of occurance is" + n );
			}
			n =0;
		}

	}

}
