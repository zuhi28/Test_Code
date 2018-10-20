package training.Java_Training.Assignment_Day2_Sept7;

public class PrintUniqueNumersInArray_3 {
    public static void main(String[] args){
        int count=0;
        int[] a = {1,2,3,4,4,5,6};
        for (int i=0; i<a.length;i++){
            for (int j =0; j<a.length; j++) {
                    if (a[i] == a[j])
                        count++;
            }
            if (count>1)
                System.out.println("Duplicated element: "+a[i] + " for " + count + " times");
            else
                System.out.println("Unique elements:"+a[i] + " ");
            count=0;
        }
    }
}
