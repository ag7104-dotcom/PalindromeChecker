package PalindromeChecker;

import java.util.Scanner;

public class palindromeCheck{

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Manager System!\nVersion 1.0\nSystem initialized successfully!\n");
        String str = "racecar";
        if(isPalindrome(str)){
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
