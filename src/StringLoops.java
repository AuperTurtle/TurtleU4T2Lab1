public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        int charNum = 0;
        String searchString1 = searchString;
        String searchString2 = searchString;
        for (charNum = charNum; searchString1.indexOf(character.toUpperCase()) != -1; charNum++) {
            searchString1 = searchString1.substring(searchString1.indexOf(character.toUpperCase()) + 1);
        }
        for (charNum = charNum; searchString2.indexOf(character.toLowerCase()) != -1; charNum++) {
            searchString2 = searchString2.substring(searchString2.indexOf(character.toLowerCase()) + 1);
        }
        return charNum;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        return "";
    }
}
