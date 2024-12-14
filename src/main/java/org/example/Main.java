package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("I did, did I ?");//true
        System.out.println("Racecar");//true
        System.out.println("hello");//false
        System.out.println("was it a car a cat I saw ?");


        System.out.println("********** Veri Yapıları Challenge II **************");
        WorkintechList<String> list = new WorkintechList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");//tekrar eden öğe eklemez
        list.add("cherry");

        list.sort();//sıralama
        list.printList();//listeyi yazdır

        list.remove("banana");// "banana" öğresini sil ve listeyi tekrar yaz
        list.printList();

        System.out.println("****** Convert Decimal Numbers To Binary");
        System.out.println(convertDecimalToBinary(5)); // output 101
        System.out.println(convertDecimalToBinary(6));// output 110
        System.out.println(convertDecimalToBinary(13)); // output 1101
         System.out.println(convertDecimalToBinary(42)); // output 101010
    }


    public static boolean checkForPalindrome(String input) {
        // Tüm büyük farfleri küçük harfe çevir ve yazlızca harfleri al
        String cleanedInput = input.replaceAll("[^ a-zA-Z]", "").toLowerCase();

//Bir yığın (stack) kullanarak polidromu kontrol  son giren ilk girer
        //prensibi ile çalışır

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

        Stack<Integer>stack = new Stack<>();
        while(number>0){
            stack.push(number%2);
            number=number/2;
        }
        StringBuilder binaryNumber=new StringBuilder();
        while(!stack.isEmpty()){
            binaryNumber.append(stack.pop());
    }
        return binaryNumber.toString();


}
}