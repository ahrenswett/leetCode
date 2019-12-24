package leetCode;

import java.util.HashSet;
import java.util.StringTokenizer;

/*
A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.

If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".

Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin.



Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


Notes:

S contains only uppercase, lowercase and spaces. Exactly one space between each word.
1 <= S.length <= 150.
 */
public class GoatLatin {
    //    String[] aeiou = {"a", "e", "i", "o", "u"};
    static HashSet<String> aeiou = new HashSet(){{ add("a"); add("A");
        add("e"); add("E");
        add("i"); add("I");
        add("o"); add("O");
        add("u"); add("U");
    }};

//   this method checks if the substring of the current word starts with aeiou and then appends per directions. It takes in the current string and what number the word is in the sentence

    public static String appender(String s, int wordPositionInSentence) {
        if (aeiou.contains(s.substring(0, 1))) {
            s += "ma";
        } else {
            s = s.substring(1) + s.substring(0, 1) + "ma";
        }

        for (int i = 0; i < wordPositionInSentence+1; i++) {
            s += "a";
        }

        System.out.println(s);
        return s;
    }


    //    this method focuses on finding the word index in a sentence and calling appender
    public static String toGoatLatin(String s) {

        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = appender(strings[i], i);
        }
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                finalString.append(strings[i]);
            } else {
                finalString.append(strings[i] + " ");
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        String str = "I was animal in the eye of the uterus";
        str = toGoatLatin(str);
        System.out.println(str);
    }
}