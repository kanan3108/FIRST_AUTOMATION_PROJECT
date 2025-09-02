package org.example;

public class stringtest {

    public static boolean isPalindrome(String str) {
        // Convert to lowercase to handle case-insensitivity
        String cleanStr = str.toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched, it's a palindrome
    }

    public static void main(String [] args)
    {
        String s="malayalam";

    for(int i=s.length()-1;i>=0;i--) {
        System.out.print(s.charAt(i));
    }
    System.out.print("\n");
stringreverse call= new stringreverse();
        System.out.println("madam-"+isPalindrome("madam")); // true
        System.out.println("Racecar-"+isPalindrome("Racecar")); // true
        System.out.println("hello-"+isPalindrome("hello")); // false
        System.out.println("nitin-"+isPalindrome("nitin"));
        System.out.println(call.reverse("won desrever si gnirts"));
    }

    }

