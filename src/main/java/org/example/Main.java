package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Palindrom testleri
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar")); // true
        System.out.println(checkForPalindrome("hello")); // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?")); // true

        System.out.println("********** Veri Yapıları Challenge II **************");
        WorkintechList<String> list = new WorkintechList<>();
        list.add("apple");
        list.add("apple");
        list.add("banana");
        list.add("apple"); // tekrar eden öğe eklenmez
        list.add("cherry");

        list.sort(); // sıralama
        list.printList(); // listeyi yazdır
        System.out.println("----");

        list.remove("banana"); // "banana" öğesini sil ve listeyi tekrar yazdır
        list.printList();

        System.out.println("****** Convert Decimal Numbers To Binary");
        System.out.println(convertDecimalToBinary(5)); // output 101
        System.out.println(convertDecimalToBinary(6)); // output 110
        System.out.println(convertDecimalToBinary(13)); // output 1101
        System.out.println(convertDecimalToBinary(42)); // output 101010
    }

    public static boolean checkForPalindrome(String input) {
        // Tüm büyük harfleri küçük harfe çevir ve yalnızca harfleri al
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Bir yığın (stack) kullanarak palindromu kontrol et
        Stack<Character> stack = new Stack<>();
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedInput = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedInput.append(stack.pop());
        }

        return cleanedInput.equals(reversedInput.toString());
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        StringBuilder binaryNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        return binaryNumber.toString();
    }
}
