package Homework2;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3 - шифриране на стринг
//        да се напише функция която получава като параметър стринг и число n и връща шифриран стринг със същата дължина.
//        Шифрирането става със отместване на всяка буква на n позиции, ако стигнем до края започваме пак от началото.
//        a, 1 => b
//        a, 2 => c
//        z, 1 => a
//        Пример:
//        "abc", 1 => "bcd"
//        "abc", 3 => "def"
//        "zab", 2 => "bcd"
        String string = "zab";
        int number = 2;
        String encryptedString = decryption(string, number);
        System.out.println(encryptedString);

    }

    static final int ALPHABET_START_INDEX = 97;
    static final int ALPHABET_END_INDEX = 122;

    private static String decryption(String string, int number) {
        StringBuilder encryptedString = new StringBuilder(string.length());
        // 97 -> a   &&  122 -> z
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            int asciiCode = symbol;
            char newSymbol;

            if (asciiCode + number > ALPHABET_END_INDEX) {
                int differance = ALPHABET_END_INDEX - asciiCode;
                newSymbol = (char) (ALPHABET_START_INDEX - 1 + (number - differance));
            } else {
                newSymbol = (char) (symbol + number);
            }
            encryptedString.append(newSymbol);
        }

        return encryptedString.toString();
    }
}
