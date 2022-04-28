package switchone;

public class SwitchOne {
    public static void main (String args[]){
        String branch= "cse";
        int year=1;

        switch(year){
            case 1:
                System.out.println("1rd year");
                switch (branch){
                    case "cse":
                        System.out.println("cse");
                        break;
                    case "ece":
                        System.out.println("ece");
                        break;
                    case "eee":
                        System.out.println("eee");
                        break;
                }
                break;
            case 2:
                System.out.println("2nd year");
                switch (branch){
                    case "cse":
                        System.out.println("cse");
                    case "ece":
                        System.out.println("ece");
                    case "eee":
                        System.out.println("eee");
                }
                break;
            case 3:
                System.out.println(" 3rd year");
                switch (branch){
                    case "cse":
                        System.out.println("cse");
                    case "ece":
                        System.out.println("ece");
                    case "eee":
                        System.out.println("eee");
                }
                break;
            default:
                System.out.println("student");
    }
}}
