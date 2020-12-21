import java.util.HashSet;
import java.util.Set;

public class Third {
    public static void main(String[] args) {
        System.out.println(solutions(1,0,-1));
        System.out.println(findZip("all zip files are compressed"));
        System.out.println(checkPerfect(28));
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(isValidHexCode("CD5C5C"));
        System.out.println(same(new int[]{1, 5, 9},new int[]{2, 2, 2,3,4,4}));
        System.out.println(isKaprekar(297));
        System.out.println(longestZero("0000111100000000111"));
        System.out.println(nextPrime(15));
        System.out.println(rightTriangle(5,3,4));
    }

    public static int solutions(int a,int b,int c){
        int d = b*b-4*a*c;
        if (d>0) {
            return 2;
        }else{
            if (d<0){
                return 0;
            }else{
                return 1;
            }
        }
    }

    public static int findZip(String s){
        int i=s.indexOf("zip")+3;
        if (s.indexOf("zip")==-1){
            return -1;
        } else{
            if (s.indexOf("zip")==s.lastIndexOf("zip")){
                return -1;
            }else {return s.indexOf("zip", i);}
        }
    }

    public static boolean checkPerfect(int a){
        int sum = 0;

        for (int i=1;i<a;i++){
            if (a%i==0){sum+=i;
        }
        }
        if (a==sum){return true;}else{return false;}
    }

    public static String flipEndChars(String str){
        char[] chars = str.toCharArray();
        int len = chars.length;
        String s;
        if (str.length()<2){s="incompatible in";}else
            {
                if (chars[0]==chars[len-1]){
                   s= "Two's a pair.";
                }else{
                    Character k = chars[0];
                    chars[0]=chars[len-1];
                    chars[len-1]=k;
                    s=String.valueOf(chars);
                }
            }
        return s;
    }

    public static boolean isValidHexCode(String s){
        boolean st=false;
        s.toLowerCase();
        char[] chars = s.toCharArray();
        if (chars[0]=='#'){
            if (chars.length>7){
                st = false;
            }else{
                for(int i=1;i<chars.length;i++){
                    if ((((int)chars[i]>96)&&((int)chars[i]<103))||(((int)chars[i])==chars[i])){
                        st=true;
                    }else{
                        st=false;
                    }
                }
            }
        }else{
            st=false;
        }
        return st;
    }

    public static boolean same(int[] a, int[] b){
        Set<Integer> a1 = new HashSet<>();
        for (int x : a) {
            a1.add(x);
        }
        Set<Integer> b1 = new HashSet<>();
        for (int x : b) {
            b1.add(x);
        }
        if (a1.size()==b1.size()){return true;}else{return false;}
    }

    public static boolean isKaprekar(int num) {
        String square = Integer.toString((int) Math.pow(num, 2));
        int length = square.length();

        if (length == 1) {
            return Integer.parseInt(square) == num;
        }

        if (length == 2) {
            return (int) square.charAt(0) + (int) square.charAt(1) == num;
        }

        int lastPart = Integer.parseInt(square.substring(Math.round((length - 1) / 2), length));
        int firstPart = Integer.parseInt(square.substring(0, Math.round((length - 1) / 2)));

        return firstPart + lastPart == num;
    }

    public static String longestZero(String str) {
        String[] zeros = str.split("1+");
        double max = -100;
        int imax = 0;

        for (int i = 0; i < zeros.length; i++) {
            int length = zeros[i].length();

            if (length > max) {
                max = length;
                imax = i;
            }
        }

        return zeros[imax];
    }

    public static int nextPrime(int num) {
        boolean isArgumentPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isArgumentPrime = false;
                break;
            }
        }

        if (isArgumentPrime) return num;

        int result = 0;

        for (int i = num + 1; i < Double.POSITIVE_INFINITY; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static boolean rightTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2);
    }



}
