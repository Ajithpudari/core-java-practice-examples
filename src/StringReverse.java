import java.util.Objects;

public class StringReverse {

    public String reverse(String str) {
        int length = str.length();
        StringBuilder output = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            output.append(str.charAt(i));
        }
        System.out.println("Reverse string is " + output);

        if (Objects.equals(str,output.toString())){
            return "Polindrome";
        }else{
          return "Not a Polindrome";
        }

    }

    public static void main(String args[]) {

        StringReverse calling = new StringReverse();
        System.out.println(calling.reverse("annaa"));


    }

}


