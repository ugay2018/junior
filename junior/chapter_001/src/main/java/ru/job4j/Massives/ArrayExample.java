package ru.job4j.Massives;

import java.sql.Array;
import java.util.Arrays;

public class ArrayExample {
    public static void main (String[] args){
int arr[]={6,5,4,3,2,1};
String[] strings = {"E","C","A","Polo"};

Arrays.sort(arr);
Arrays.sort(strings);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strings));
    }
}
