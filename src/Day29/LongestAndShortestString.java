package Day29;

public class LongestAndShortestString {

    public static void main(String[] args) {

        String [] strs={"apple", "java", "computer", "water"};

        String smallest =strs[0];
        String biggest = strs[0];

        for (int i = 0; i < strs.length; i++) {

            if (strs[i].length() > biggest.length()){
                biggest= strs[i];
            }
            if (strs[i].length()< smallest.length()){
                smallest= strs[i];
            }
        }

        for (String word: strs){
            if (word.length() > biggest.length()){
                biggest=word;
            }
            if (word.length() < smallest.length()){
                smallest=word;
            }
        }
        System.out.println("Biggest String: " + biggest);
        System.out.println("Smallest String: " + smallest);

    }
}
