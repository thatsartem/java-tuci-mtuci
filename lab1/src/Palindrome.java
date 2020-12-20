import java.util.Scanner;

public class Palindrome {

    public static String ReverseString(String s){
        String a="";
        for (int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        return a;
    }

        public static boolean IsPalindrome(String s){
        return s.equals(ReverseString(s));
        }

    public static void main(String[] args) {
        for (int i=0; i<args.length; i++){
            String s = args[i];
           //Scanner console = new Scanner(System.in);
           //String s = console.nextLine();
           System.out.println(IsPalindrome(s));
        }
    }
}
