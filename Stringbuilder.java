import java.util.*;

public class Stringbuilder {

    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Hardik");
        System.out.println(sc);

        // character at index 0
        System.out.println(sc.charAt(0));

        // set char at index
        sc.setCharAt(0, 'p');
        System.out.println(sc);
        
        // insert
        sc.insert(0, 'G');
        System.out.println(sc);
        sc.insert(2, 'G');
        System.out.println(sc);

        // delete
        sc.delete(0, 3);
        System.out.println(sc);
    }
}

/*
 * 
 * Strings are immutable in java
 * 
 * String str = "h"; to ab jo str hai vo stack me store hoga or jo h hai vo heap
 * mai store hoga
 * ab mujhe isko hello bannana hai to
 * str + "e" => he
 * str + "l" =>hel
 * str + "l" =>hell
 * str + "o" =>hello
 * 
 * Stringbuilder use for
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */