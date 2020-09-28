package String_HW_3;

import java.util.Arrays;


public class Third_Home_Work {
    public static void main(String[] args) {


        /**
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */

        String myFullName = "Mahdiya Chowdhury";

        int indexOfTheSpace = myFullName.indexOf(" ");
        String myFirstName = myFullName.substring(0, indexOfTheSpace);
        System.out.println("My first name is " + myFirstName);

        int lengthOfTheFirstName = myFirstName.length();
        System.out.println("The length of my first mame is: " + lengthOfTheFirstName);

        String myLastName = myFullName.substring(indexOfTheSpace + 1);
        boolean doesLastNameStarts_K = myLastName.startsWith("K");
        System.out.println("Does my last name starts with K: " + doesLastNameStarts_K);

        char lastAlphabetOfFirstName = myFirstName.charAt(lengthOfTheFirstName - 1);
        System.out.println("The last alphabet of my first name is: " + lastAlphabetOfFirstName);

        String myLastNameToUppercase = myLastName.toUpperCase();
        boolean doesLastNameEndsWith_M = myLastNameToUppercase.endsWith("M");
        System.out.println("Does my last name ends with M : " + doesLastNameEndsWith_M);





        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */

        String myStatment = "I am a good programmer";

        String [] wordsOfMyStatement = myStatment.split(" ");
        System.out.println(Arrays.toString(wordsOfMyStatement));

        int length1 = wordsOfMyStatement[0].length();
        int length2 = wordsOfMyStatement[1].length();
        int length3 = wordsOfMyStatement[2].length();
        int length4 = wordsOfMyStatement[3].length();
        int length5 = wordsOfMyStatement[4].length();

        int totalNoOfWords = length1 + length2 + length3 + length4 + length5;
        System.out.println("The total number of words is: "+ totalNoOfWords);

        //int numbersOfWords = wordsOfMyStatement.length;
        //System.out.println("The numbers of words in the my statement is: " + numbersOfWords);

        String rRelaceToF = myStatment.replace('r', 'f');
        System.out.println("By replacing 'r' to 'f' my statement becomes: " + rRelaceToF);




        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */


        String firstName = "Mamta";

        String [] firstNameSplit = firstName.split("");

        int lengthFirstName = firstNameSplit.length;
        System.out.println("The length of my first name is: " + lengthFirstName);

       /* int lengthof1stString = firstNameSplit[0].length();
        int lengthof2ndString = firstNameSplit[1].length();
        int lengthOf3rdString = firstNameSplit[2].length();
        int lengthOf4thString = firstNameSplit[3].length();
        int lengthOf5thString = firstNameSplit[4].length();

        int totalLength = lengthof1stString + lengthof2ndString + lengthOf3rdString +lengthOf4thString + lengthOf5thString;

        System.out.println("The length of the first name is: " + totalLength);*/


        /**
         *
         *  String myStatment = "I am a good programmer";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */

        String strNew = "I am a good programmer";

        int lengthOfStrNew = strNew.length();

        boolean result = lengthOfStrNew>10?true:false;
        System.out.println("Does the length of statement greater than 10: " + result);




        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */

        String threeWordsSentence =  "hApPY nEW yeAr";

        threeWordsSentence = threeWordsSentence.toLowerCase();

        String [] words = threeWordsSentence.split(" ");
        System.out.println(Arrays.toString(words));

        String firstLetterOfWord_0 = words[0].substring(0,1);
        firstLetterOfWord_0 = firstLetterOfWord_0.toUpperCase();
        String restLettersOfWord_0 = words[0].substring(1);

        words [0] = firstLetterOfWord_0 + restLettersOfWord_0;
        System.out.println(words [0]);

        String firstLetterOfWord_1 = words[1].substring(0,1);
        firstLetterOfWord_1 = firstLetterOfWord_1.toUpperCase();
        String restLetterOfWord_1 = words[1].substring(1);

        words [1] = firstLetterOfWord_1 + restLetterOfWord_1;
        System.out.println(words [1]);

        String firstLetterOfWord_2 = words [2].substring(0,1);
        firstLetterOfWord_2 =firstLetterOfWord_2.toUpperCase();
        String restLetterOfWord_2 = words [2].substring(1);

        words [2] = firstLetterOfWord_2 + restLetterOfWord_2;
        System.out.println(words [2]);

        threeWordsSentence = words [0] + " " + words [1] + " " + words [2];
        System.out.println(threeWordsSentence);



        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */

        String threeWordsSentence2 =  "Lab sessIONS clAsses";
        threeWordsSentence2 = threeWordsSentence2.toUpperCase();
        String [] words_2 = threeWordsSentence2.split(" ");

        String firstLetterof1Word = words_2 [0].substring(0,1);
        words_2 [0] = firstLetterof1Word;

        String firstLetterOf2ndWord = words_2 [1].substring(0,1);
        words_2 [1] = firstLetterOf2ndWord;


        String firstLetterOf3rdWord = words_2 [2].substring(0,1);

        words_2 [2] = firstLetterOf3rdWord;

        threeWordsSentence2 =  words_2 [0]+ words_2 [1] + words_2 [2];
        System.out.println("The abbreviation of Lab sessIONS clAsses is: " + threeWordsSentence2 );




    }
}
