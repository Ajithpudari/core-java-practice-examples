package geeks;

public class Fibonaccie {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int i = 0;
        int c;
        System.out.print(a +" " +b + " ");
        c=a+b;
        while(i<=10){
            System.out.print(" " +c);
            a=b;
            b=c;
            c=a+b;
            i++;
        }




    }
}