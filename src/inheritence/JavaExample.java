package inheritence;

public class JavaExample extends Teacher{
        String mainSubject = "Physics";
        public static void main(String args[]){
            JavaExample obj = new JavaExample();
            System.out.println(obj.mainSubject);
            obj.does();
        }


}

