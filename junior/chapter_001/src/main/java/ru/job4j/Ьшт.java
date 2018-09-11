package ru.job4j;

import java.util.Arrays;

public class Ьшт {
    public static void main(String[] args) {
        int[] arr = {-4, 3, 1, 10, -9};
for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);
}

int sum=0;
for(int j=0; j<arr.length; j++){
   sum+=arr[j];

}
        System.out.println("Summa = "+sum);

int max=arr[0];
for(int i=1; i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }

}
        System.out.println("Max element is = "+max);

int min=arr[0];
for(int i=0; i<arr.length; i++){
    if(arr[i]<min){
        min=arr[i];
    }
}
        System.out.println("Min element is="+min);
int tmp=0;
for(int i=0; i<arr.length-1 ; i++){
    for(int j=0; i<arr.length-i-1 ; j++){
        if(arr[j]>arr[j+1]){
            tmp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=tmp;
        }
    }
    System.out.println(Arrays.copyOf(arr, 4));
}
    }
}
