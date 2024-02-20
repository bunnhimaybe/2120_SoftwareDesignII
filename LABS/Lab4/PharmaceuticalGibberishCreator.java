import java.util.Random;

/**
    @auth Nhi Pham
    @version 2.0

    Main method to run the PharmaceuticalGibberishCreator
*/
public class PharmaceuticalGibberishCreator {
    public static void main(String[] args) {

        // 01 - create a string containing all the consonants
        String consonants = "bcdfghjklmnpqrstvwxz";

        // 02 - create a string containing all the vowels
        String vowels = "aeiouy";

        // 03 - use strings to create character arrays for consonants and vowels
        char[] consonantChars = consonants.toCharArray();
        char[] vowelChars = vowels.toCharArray();

        // 04 - create an empty string builder
        StringBuilder drug = new StringBuilder();

        // 05 - compound consonant clustors String array
        //      triple compounds spl, spr, str, skr, thr, skw, shw, shm
        String[] compounds = new String[] {"bl", "gl", "pl", "kl", "br", "dr", "gr", "pr", "tr", "kr", "sp", "st", "sk", "sl", "sm", "sn", "fl", "fr", "sw", "tw", "fy"};

        // 06 - create a random number generator
        Random rand = new Random();

        // 07 - create integers for consonantChars and vowelChars range
        int possibleConsonants = consonantChars.length;
        int possibleVowels = vowelChars.length;
        int possibleCompounds = compounds.length;

        // 08 - name pattern (5) ccvc 
        for (int i = 0; i < 5; i++){

            // even insert is a vowel
            if (i % 2 == 0){
                drug.append(vowelChars[ (rand.nextInt(possibleVowels)) ]);
            }

            // multiple of 3 insert is consonant
            else if (i % 3 == 0 && i > 0){
                drug.append(consonantChars[ (rand.nextInt(possibleConsonants)) ]);
            }

            // odd (not multiple of 3) insert is a compound
            else {
                drug.append(compounds[ (rand.nextInt(possibleCompounds)) ]);
            }
        }

        // 8 - print out your fancy new drug name!
        System.out.println(drug);

    } // end main

} // end class
