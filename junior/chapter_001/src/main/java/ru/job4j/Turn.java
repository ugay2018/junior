package ru.job4j;

import java.util.Arrays;

public class Turn {

    public int[] turn(int[] arr){
        for(int i=0; arr.length/2>i; i++){
            int tmp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {


    }
}
