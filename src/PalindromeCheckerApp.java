import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        useCase1();
        useCase2();
        useCase3();
        useCase4();
        useCase5();
        useCase6();
    }

    static void useCase1() {
        System.out.println("=====================================");
        System.out.println("     Welcome to Palindrome Checker App");
        System.out.println("=====================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : 1.0");
        System.out.println("Description      : Console-based Java application");
        System.out.println("-------------------------------------");
        System.out.println("Program started successfully.");
        System.out.println("Ready to proceed to next use case...");
    }

    static void useCase2() {
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
        System.out.println("Program executed successfully.");
    }

    static void useCase3() {
        String original = "level";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
        System.out.println("Program executed successfully.");
    }

    static void useCase4() {
        String word = "radar";
        char[] characters = word.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < characters.length / 2; i++) {
            if (characters[i] != characters[characters.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
        System.out.println("Program executed successfully.");
    }

    static void useCase5() {
        String word = "madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
        System.out.println("Program executed successfully.");
    }

    static void useCase6() {
        // Define the input string to validate
        String input = "civic";
        // Create a queue to store characters in FIFO order
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        // Create a stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();
        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        // Flag to track palindrome status
        boolean isPalindrome = true;
        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
        System.out.println("Program executed successfully.");
    }
    static void useCase7(){
        //Define the input string
        String input = "refer";
        //Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();
        //Add each character to the deque
        for (char c : input.toCharArray()){
            deque.add(c);
        }
        //Flag to track palindrome result
        boolean isPalindrome = true;
        //Continue comparison while more than one element exists
        while (deque.size()>1){
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
        System.out.println("Program executed successfully.");
    }
}
