package training.Java_Training.Assignment_Day2_Sept7;

import java.util.Scanner;
public class PutEvenAtStartInArray_2 {
    public static void method1(){
        int a[] = {2,2,2,5,7 ,8 ,9,2};
        int i=0; int j=a.length-1;
        while (j>i){
            while (a[i]%2==0 && i<a.length-1)
                i++;
            while (a[j]%2!=0 && j>0)
                j--;
            int t = a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        for (int k=0; k<a.length; k++)
            System.out.print(a[k]);
    }
    public static void method2(){
        int a[] = {2,2,2,5,7 ,8 ,9,2};
        int i=0;
        for (int j =0; j<a.length; j++){
            if (a[j]%2==0){
                int tmp= a[i];
                a[i]= a[j];
                a[j]= tmp;
                i++;
            }
        }
        for (int k=0; k<a.length; k++)
            System.out.print(a[k]);
    }
    public static void main(String[] args) {
        method1();
        method2();

    }
}



