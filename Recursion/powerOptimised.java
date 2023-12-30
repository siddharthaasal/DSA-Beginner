package Recursion;

public class powerOptimised {

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = power(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2!=0){
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(power(2, 10));
    }
}
