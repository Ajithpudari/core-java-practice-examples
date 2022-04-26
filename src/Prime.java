public class Prime {
    public static void main(String args[]) {
        int i = 2;
        int num = 13;
        boolean temp = false;

        while (i < num) {
            if(num % i == 0){
                temp = true;
                break;
            }
        i++;
        }
        if(temp==true){
            System.out.println(num + "it is prime");
        }else
        {
            System.out.println(num + "not prime");
        }
    }
}