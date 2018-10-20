package training.Java_Training.Assignment_Day2_Sept7;

public class SortUsingSelection {
    public static void main(String[] args){
        int a[] = {1,-2,5,7,10,-1};
        for (int i =0; i<a.length; i++){
            for (int j=i; j<a.length; j++){
                if (a[i]>a[j]){
                    int tmp =a[j];
                    a[j]=a[i];
                    a[i]=tmp;
                }
            }
        }
        for (int k=0; k<a.length;k++)
            System.out.print(a[k] + " ");
    }
}
