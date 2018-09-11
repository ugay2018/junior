package ru.job4j;

import java.lang.invoke.LambdaMetafactory;

public class Factorial {

public int calc(int n){
if(n==0){
    return 1;
}
int fact=1;
for(int i=1; i<=n; i++){
    fact*=i;
}
    return fact;
}

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int res=factorial.calc(0);
        System.out.println(res);
    }

}