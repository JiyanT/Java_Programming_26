package Day30;

public class LongestPalindrome {

    public static void main(String[] args) {

        String [] words ={"java", "longer world", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrome= "";

        String [] word= {"abc", "dna", "kevin", "joe", "lamp"};

        for (String eachWord : words){
            boolean isPalindrome = true;

            for (int i=0; i< eachWord.length(); i++){

                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length()-1-i)){
                    isPalindrome= false;
                    break;

                }
            }
            if (isPalindrome && (eachWord.length()>longestPalindrome.length() )) {

                longestPalindrome=eachWord;

            }
        }
        System.out.println(longestPalindrome.isEmpty() ? "No palindrome" : longestPalindrome);



    }
}
