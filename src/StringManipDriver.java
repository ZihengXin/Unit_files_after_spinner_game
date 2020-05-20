public class StringManipDriver {

    public static void main(String[] args) {
        String testStringOne = "a man a plan a canal panama";
        String testStringTwo = "race car";
        String testStringThree = "silos of oils";

        System.out.println(StringManip.removeSpaces(testStringOne)); // amanaplanacanalpanama
        System.out.println(StringManip.removeSpaces(testStringTwo)); // racecar
        System.out.println(StringManip.removeSpaces(testStringThree)); // silosofoils

        System.out.println(StringManip.reverseString(testStringOne)); // amanaplanacanalpanama
        System.out.println(StringManip.reverseString(testStringTwo)); // racecar
        System.out.println(StringManip.reverseString(testStringThree)); // sliofosolis

        StringManip.palindromeChecker(testStringOne); // "a man a plan a canal panama is a palindrome"
        StringManip.palindromeChecker(testStringTwo); // racecar is a palindrome
        StringManip.palindromeChecker(testStringThree); // "silos of oils is not a palindrom"

    }
}
