package BasicPractices;

public class PalindromString {

    public static void main(String[] args) {
        String s = "malayalam";
        int start = 0;
        int end = s.length() - 1;
        boolean ans = findPalindrome(s,start,end);
        if(ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }

    public static boolean findPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
