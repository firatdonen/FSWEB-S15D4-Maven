package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("I did, did I ?");//true
        System.out.println("Racecar");//true
        System.out.println("hello");//false
        System.out.println("was it a car a cat I saw ?");
    }
        public static boolean checkForPalindrome(String input){
     // Tüm büyük farfleri küçük harfe çevir ve yazlızca harfleri al
String cleanedInput=input.replaceAll("[^ a-zA-Z]","").toLowerCase();

//Bir yığın (stack) kullanarak polidromu kontrol  son giren ilk girer
        //prensibi ile çalışır

 Stack<Character> stack= new Stack<>();
 for(char c :cleanedInput.toCharArray()){
     stack.push(c);

 }
 StringBuilder  reversedInput = new StringBuilder();
 while(!stack.isEmpty()){
     reversedInput.append(stack.pop());
      }
            return cleanedInput.equals(reversedInput.toString());
        }
    }

