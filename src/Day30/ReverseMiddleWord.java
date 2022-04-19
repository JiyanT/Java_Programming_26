package Day30;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseMiddleWord {

    public static void main(String[] args) {

        String str= "java always fun";

        String [] word= str.split(" ");

        System.out.println(Arrays.toString(word));

        String reversedMiddle = "" ;

        char [] middleWord = word[1].toCharArray();   //  very important!!!

        System.out.println(Arrays.toString(middleWord));

        for (int i= middleWord.length-1; i>=0; i--){

            reversedMiddle+= middleWord[i] + " ";
        }

        System.out.println(word[0] + " " + reversedMiddle + " " + word[2]);
    }
}
