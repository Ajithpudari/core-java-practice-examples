package geeks;

public class Factorial {
    public static void main(String args[]){
        int x=5;
        int sum =1;
        for (int i=1;i<=x;i++){
            sum = sum * i;
        }
        System.out.println(" "+sum);
    }
 }
