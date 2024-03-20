// import java.util.Scanner;

public class string {

    public static void main(String[] args) {

        // String name = "HARDIK";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.err.println("Your name is : " +name);
        // sc.close();

        // COMPARE STRING
        // String name1 = "Hardik";
        // String name2 = "Hardik";

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal ");
        // } else {
        //     System.out.println("Strings are not equal ");
        // }
        
        // new String is a way to build string and it is a non primtive type
        // if (new String("tony")== new String("tony")) {
        //     System.out.println("String are equal");
        // }
        // else{
        //         System.out.println("Strings are not equal ");

        // }

        String sentence = "My name is Hardik" ;
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
