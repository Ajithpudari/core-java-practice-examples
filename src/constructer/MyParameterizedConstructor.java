package constructer;

public class MyParameterizedConstructor {
    private String name;

    public MyParameterizedConstructor(String str){
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+str);
    }

    public static void main(String a[]){
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("aj");
    }
}
