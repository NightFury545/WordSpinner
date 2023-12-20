public class Main {

    public static void main(String[] args) {
        System.out.println(spinWords("My name is Ruslan what about your name"));
    }

    private static String spinWords(String inputData) {
        char[] chars = inputData.toCharArray();
        if (checkLettersAndSpaces(chars)) {
            String[] arrayOFsplitedStringsBySpaces = inputData.split(" ");
            String resultString = "";
            for (int i = 0; i < arrayOFsplitedStringsBySpaces.length; i++) {
               if (arrayOFsplitedStringsBySpaces[i].length() >= 5) {
                   String reversedWord = reverseWord(arrayOFsplitedStringsBySpaces[i]);
                   resultString += reversedWord + " ";
               } else {
                   resultString += arrayOFsplitedStringsBySpaces[i] + " ";
               }
            }
            return resultString;
        } else {
            return "Рядок повинен складатися тільки з літер та пропусків!";
        }

    }

    private static boolean checkLettersAndSpaces(char[] chars) {
        for (char currentChar : chars) {
            if (!Character.isLetter(currentChar) && !Character.isWhitespace(currentChar)) {
                return false;
            }
        }

        return true;
    }

    private static String reverseWord(String inputWord) {
        char[] charsOfWord = inputWord.toCharArray();

        for (int i = 0; i < charsOfWord.length / 2; i++) {
            char temp = charsOfWord[i];
            charsOfWord[i] = charsOfWord[charsOfWord.length - 1 - i];
            charsOfWord[charsOfWord.length - 1 - i] = temp;
        }

        String resultWord = "";
        for (char currentLetter : charsOfWord) {
            resultWord += currentLetter;
        }
        return resultWord;
    }
}