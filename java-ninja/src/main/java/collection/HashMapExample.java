package collection;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args){
        //getObjectExample();
        //cloneExample();
        //exampleOfMethodsInHashMap();
        //additionOfNumbersCount();
        //sumOfDigitsOfANumber();
        //reverseOfANumber();
        //oddEvenIndentification();
        //System.out.println(recursion(3,8));
        //System.out.println(factorial(10000));
         recursionEx(4);
    }

    private static void recursionEx(int n) {
        /*if(n == 0)
            return;

        recursionEx(n/2);
        System.out.print(n);
        System.out.print(n%2);
        System.out.println();
          */
        if (n > 1)
            recursionEx(n-1);
        for (int i = 0; i < n; i++)
            System.out.print("*");
        System.out.println();
    }
    private static int factorial(int n) {
        if (n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

    private static int recursion(int i, int j) {
        if(i>j) {
            System.out.println(i);
            return 0;
        }
        else {
            i++;
            recursion(i,j);
        }
        return i;
    }

    private static void oddEvenIndentification() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        int n = reader.nextInt();
        if(n%2==0)
            System.out.println("Its even");
        else
            System.out.println("Its odd");
    }

    private static void reverseOfANumber() {
        int reversed =0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number to be reversed: ");
        int n = reader.nextInt();
        while(n!=0){
            reversed = reversed*10 + n%10;
            n=n/10;
        }
        System.out.println("Reversed Number is: " + reversed);
    }

    private static void sumOfDigitsOfANumber() {
        int sum=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        while(n!=0){
            sum = sum + n%10;
            n=n/10;
            System.out.println(sum);
        }
        System.out.println("Sum is: "+ sum);
    }

    private static void additionOfNumbersCount() {
        int[] arrayOfNumbers = {1,1,1,1,1,4,4,5,6,9,1,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arrayOfNumbers.length;i++){
            int val=arrayOfNumbers[i];
            if (!map.containsKey(val)) {
                map.put(val, 0);
            }
            map.put(val, map.get(val)+1);
        }
        System.out.println(map);
    }

    private static void exampleOfMethodsInHashMap() {
        HashMap<Integer, String> mapExample = new HashMap<>();
        mapExample.put(1,"Delhi");
        mapExample.put(2,"Kol");
        mapExample.put(3,"Shimla");
        System.out.println(mapExample.isEmpty());
        System.out.println(mapExample.keySet());
        System.out.println(mapExample.size());
        System.out.println(mapExample.hashCode());
        System.out.println(mapExample.values());
        System.out.println(mapExample.getClass());
        System.out.println(mapExample.containsKey(3));
        System.out.println(mapExample.containsValue("Delhi"));
        System.out.println(mapExample.remove(1));
        System.out.println(mapExample);
    }

    private static void cloneExample() {
        HashMap<Integer, String> mapExample = new HashMap<>();
        mapExample.put(1,"India");
        mapExample.put(2,"Australia");
        mapExample.put(3,"England");
        mapExample.put(4,"America");
        System.out.println(mapExample);
        for (int i=1;i<=4;i++)
        System.out.print(mapExample.get(i) + " ");
        System.out.println();
        mapExample.clone();
        System.out.println(mapExample.clone());
        HashMap<Integer, String> mapExample1 = (HashMap<Integer, String>) mapExample.clone();
        System.out.println(mapExample1);
        mapExample.clear();
        System.out.println(mapExample);

    }

    private static void getObjectExample() {
        HashMap<Integer, String> mapExample = new HashMap<>();
        mapExample.put(1,"Ram");
        mapExample.put(2,"Mohan");
        mapExample.put(3,"Raaz");
        System.out.println(mapExample);
        System.out.println(mapExample.get(3));
        System.out.println(mapExample.get(1));
    }

}
