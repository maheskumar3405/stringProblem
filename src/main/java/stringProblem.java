import java.util.Scanner;

/**
 * Created by MahiMac on 7/10/15.
 */
public class stringProblem {


    public static void main(String[] args){

        stringProblem obj = new stringProblem();

        Scanner scanner = new Scanner(System.in);


        String word="California";
        char character= 'a';

        System.out.println(obj.oneLineStrip(word, character));
        System.out.println(obj.discreteStrip(word, character));

    }

    public String  oneLineStrip(String word,Character character){

        String result = new String(word.toLowerCase());

        if(!(Character.isWhitespace(character))){
            String ch = Character.toString(character);

            result=word.toLowerCase().replace(ch, "");
        }

        return result;
    }


    public String discreteStrip(String word,Character character){

        StringBuilder result = new StringBuilder();


        if(!(Character.isWhitespace(character))) {
            char[] str = word.toLowerCase().toCharArray();

            //Converting to lowercase for consistency
            if (!(Character.isLowerCase(character))) {
                character = character.toString().toLowerCase().charAt(0);
            }

            for (char c : str) {

                if (c != character) {
                    result.append(c);
                }
            }
        }
        else {
            result.append(word.toLowerCase());
        }
        return result.toString();

    }


}
