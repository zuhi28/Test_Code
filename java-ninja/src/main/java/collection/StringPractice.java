package collection;
import java.util.ArrayList;
public class StringPractice {
    public static void main(String[] args) {
        //testArrayListMethod();
        //rotateArray();
        //flipArray();
        //swapTwoNumbers();
        //maxArrayValue();
        //swapFirstLastArray();
        //multiplicationOfTwoArray();
        //stringAddition("limit");
        //integerOperation();
        //additionOfDigitsOfANumber(12333339);
        //reverse();
        //swappingWithOutTmp();
        //numberOfCharOcc(); // TODO
//        stringReverse("Monday");
          compareStrings();
//        removeCharOfString("Monica",3);
        //replaceASubstring("Hi, how are u","Hi", "I know" );
        //searchAWord();
//        splitString();
//          displayChars("Monday");
    }

    /**
     * This display chars written by baklelhi
     * @param str
     */
    private static void displayChars(String str) {
        Integer i = Integer.MAX_VALUE;
        System.out.println((int) i-1);
        System.out.println((int) i);
        System.out.println((int) i+1);
        System.out.println((int) i+2);
    }

    private static void splitString() {
        String str1 = "I am a good biker";
        String[] str2 = str1.split("a");
        for(String s:str2)
        System.out.println(s);
    }

    private static void searchAWord() {
        String str1 = "I am a girl";
        String str2 = "am";
        Boolean tmp = str1.contains(str2);
        System.out.println(tmp);
    }

    private static void replaceASubstring(String str1, String str2, String str3) {
        String str4 = str1.replaceAll(str2, str3);
        System.out.println(str4);
    }

    private static void removeCharOfString(String s, int pos) {
        String str = s.substring(0, pos) + s.substring(pos + 1);
        System.out.println("String after removing character at position" + pos +
        "is: " + str);
    }

    private static void compareStrings() {
        String str0 = "Hey you";
        String str1 = "Hey you";
        String str2 = "Hey Zou";
        System.out.println(str1.compareTo(str2));
        System.out.println((int) 'y' - (int) 'Z');
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println((int) 'y' - (int) 'z');
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("start");
        System.out.println(str1==str0);
        System.out.println(str1==str2);
        String str3 = new String(str1);
        System.out.println("str1=" + str1);
        System.out.println("str3=" + str3.hashCode());
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);
        String str4 = new String(str1);
        System.out.println(str4 == str3);
    }

    private static void stringReverse(String original) {
        String reversed = "";
               for (int k = original.length() - 1; k >= 0; k--) {
             reversed = reversed + original.charAt(k);
        }
        System.out.println("Reversed string is : " + reversed);
    }
    private static void numberOfCharOcc(){
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
    private static void swappingWithOutTmp() {
        int a = 21;
        int b = 44;
        a = a+b;
        b =a-b;
        a =a -b;
        System.out.print(a + " " + b);
    }

    private static void reverse() {
        char[] original = {'m', 'o', 'n', 'd', 'a', 'y'};
        for (int i = original.length - 1; i >= 0; i--) {
            System.out.print(original[i]);
        }
    }

    private static void additionOfDigitsOfANumber(int number) {
        int sum = 0;
        while (number != 0) {
            int tmp = number % 10;
            sum = sum + tmp;
            number = number / 10;
        }
        System.out.println("sum is : " + sum);
    }

    private static void integerOperation() {
        int n = 36;
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        }
        System.out.print("And, the value of n is redused to: " + n);
    }

    private static void stringAddition(String str) {
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        String result = str.substring(0, 3);
        System.out.println(result + str + result);
        String concatresult = result.concat(str).concat(result);
        System.out.println(concatresult);
        String replaceresult = str.replace("i", "u");
        System.out.println(replaceresult);
        Boolean startsWithresult = str.startsWith("iu");
        System.out.println(startsWithresult);
        Boolean containsresult = str.contains("b");
        System.out.println(containsresult);

    }

    private static void multiplicationOfTwoArray() {
        // TODO Auto-generated method stub
        int tmp = 0;
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5, 0};
        for (int i = 0; i < array1.length; i++) {
            tmp = array1[i] * array2[i];
            array1[i] = tmp;
        }
        for (int i = 0; i < array1.length; i++)
            System.out.println(array1[i]);
    }

    private static void swapFirstLastArray() {
        int[] swapArray = {1, 2, 3, 5, 6, 4, 1, 8};
        int tmp = swapArray[0];
        swapArray[0] = swapArray[swapArray.length - 1];
        swapArray[swapArray.length - 1] = tmp;
        for (int i = 0; i < swapArray.length; i++)
            System.out.print(swapArray[i]);

    }

    private static void maxArrayValue() {
        // TODO Auto-generated method stub
        int[] array = {10, 4, 5, 9, 11};
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                tmp = array[i];
            else
                tmp = array[i + 1];

        }
        System.out.print("Max value is: " + tmp);
    }

    private static void swapTwoNumbers() {
        int a = 1;
        int b = 2;
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swapped number is: " + a + b);

    }

    private static void flipArray() {
        // TODO --need to fix this
        int[] orgAr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < orgAr.length / 2; i++) {
            int tmp = orgAr[i];
            orgAr[i] = orgAr[orgAr.length - 1 - i];
            orgAr[orgAr.length - 1 - i] = tmp;
        }

        for (int i = 0; i < orgAr.length; i++)
            System.out.print(orgAr[i]);

    }

    private static void rotateArray() {
        int[] orgAr = {5, 9, 10};
        int[] rotAr = new int[orgAr.length];
        int tmp = orgAr[0];
        rotAr[orgAr.length - 1] = tmp;
        for (int i = 0; i < orgAr.length - 1; i++) {
            rotAr[i] = orgAr[i + 1];
        }
        for (int i = 0; i < orgAr.length; i++)
            System.out.println(rotAr[i]);
    }

    private static void testArrayListMethod() {

        ArrayList<Integer> seriaNo = new ArrayList<Integer>();
        seriaNo.add(3);
        seriaNo.add(2);
        seriaNo.add(1);
        System.out.println(seriaNo);
        for (Integer i : seriaNo) {
            System.out.println(i);
            // System.out.print(i);
        }
        seriaNo.remove(0);
        // for(Integer i:Serialno) {
        System.out.println(seriaNo);
        // }
        // Sorting current ArrayList as [1,2,3]
        Integer temp = seriaNo.remove(0);
        // System.out.print(Serialno);
        seriaNo.add(temp);
        seriaNo.add(3);
        System.out.println(seriaNo);
        int totalno = seriaNo.size();
        System.out.println("Strength of ArraYList is" + totalno);
        Boolean k = seriaNo.contains(3);
        System.out.println(k);
        seriaNo.clear();
        System.out.println(seriaNo);
        int totalno1 = seriaNo.size();
        System.out.println("Strength of ArraYList is" + totalno1);
    }
}
