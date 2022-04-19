package Day30;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        /*
        Given a sentence
        today is monday
        reverse the sentence
        monday is today
         */

        String str="today is monday";

        String [] strArray= str.split(" ");

        System.out.println(Arrays.toString(strArray));

        String reversed= "";

        for (int i= strArray.length-1; i>=0; i--){
            reversed+=strArray[i] + " ";
        }

        System.out.println(reversed.trim());

        }




}
