package ru.netology.javaqa;

public class MaxService {

    public int findMax( int a, int b ) {
        if( a > b ) {
            return a;
        } else if( b > a ){
            return b;
        }

        System.out.println("Числа равны.");
        return 0;
    }
}
