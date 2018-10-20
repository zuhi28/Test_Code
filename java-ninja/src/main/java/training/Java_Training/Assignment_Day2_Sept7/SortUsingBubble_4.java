package training.Java_Training.Assignment_Day2_Sept7;

public class SortUsingBubble_4 {
    public static void main(String[] args){
        int a[] = {1,-2,5,7,10,-1};
        for (int i =0; i<a.length; i++){
            for (int j=0; j<a.length-1; j++){
                if (a[j]>a[j+1]){
                    int tmp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for (int k=0; k<a.length;k++)
            System.out.print(a[k] + " ");
    }
}
