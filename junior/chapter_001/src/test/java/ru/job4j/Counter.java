package ru.job4j;



/**
 * Подсчет суммы чётных чисел в диапазоне
 */
public class Counter {
public int add(int start, int finish){
    int sum = 0;
    for( int i = 0; i<finish; i++){
        if(i%2==0){
            sum+=i;
        }
    }
    return sum;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        int res = counter.add(2, 5);
        System.out.println(res);
    }
}
