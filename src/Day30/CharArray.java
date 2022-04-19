package Day30;

import java.util.Arrays;
import java.util.Locale;

public class CharArray {
    public static void main(String[] args) {

        char[] letters={'j', 'a', 'v', 'a'} ;

        String word = "java";

      char [] java= word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        for (char eachChar: java){
            System.out.println(eachChar);
        }
        System.out.println(java[0]);

        // String s= "abc";
        // s.toCharArray() --> [a,b,c];


        // char[] arr={'z', 'y', 'x'};
        // String str= new String(arr);

        char[] day= { 'm', 'o', 'n', 'd', 'a', 'y'} ;
        System.out.println(day.length);

        String strDay= new String(day);
        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day);
        // System.out.println(day.toUpperCase());  cannot use String methods on a char[]

    }
}
