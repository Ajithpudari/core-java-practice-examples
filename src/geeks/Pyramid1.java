package geeks;

public class Pyramid1 {
    public static void main(String Args[]){

        int num=7;
        for (int j=num; j>=1; --j)
        {
            for (int i=1; i<=j ;++i)
                System.out.print("*");
        }
        System.out.println(" ");
    }
}
