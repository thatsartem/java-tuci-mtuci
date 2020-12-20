import java.util.Arrays;



public class Second {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println();
        System.out.println(differenceMaxMin(new int [] {10,4,1,4,-10,-50,32,21}));
        System.out.println(isAvgWhole(new int[] {1,3}));
        System.out.println(isAvgWhole(new int[] {1,2,3,4}));
        System.out.println(cumulativeSum(new int[]{1,2,3}));
        System.out.println(cumulativeSum(new int[]{3,3,-2,408,3,3}));
        System.out.println(getDecimalPlaces("43.1"));
        System.out.println(Fibonacci(7));
        System.out.println(isValid("59001"));
        System.out.println(isValid("393939"));
        System.out.println(isValid("732 2"));
        System.out.println(isStrangePair("ratio","orator"));
        System.out.println(isStrangePair("bush","hubris"));
        System.out.println(isStrangePair("",""));



    }

    public static String repeat(String s, int ch) {
        String st = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < ch; j++) {
                st += chars[i];
            }


        }
            return st;
    }

    public static int differenceMaxMin(int[] a){
        int max,min;max=a[0];min=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max) max=a[i];
            if (a[i]<min) min=a[i];

        }
        return max-min;
    }

    public static boolean isAvgWhole(int[] a){
        double avg;double sum=0;
        for( int am: a){

            sum+=am;
        }
        avg = sum/a.length;
        if (avg%1==0) {return true;} else {return false;}

    }

    public static String cumulativeSum(int[] a){
        int sum=0;
        int[] b=a;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            b[i]=sum;
        }
        return Arrays.toString(b);
    }

    public static int getDecimalPlaces(String s){

        char[] chars= s.toCharArray();
        int kol=0;
        char st;
        st='.';
        if (s.contains(".")){
            for(int i=0;i<chars.length;i++){

                if (s.charAt(i) == '.') {kol=chars.length-(i+1);}
            }

        }
        return kol;
    }

    public static int Fibonacci(int n){

            if(n==1) return 1; if (n==2)  return 1;
            return Fibonacci(n-1)+Fibonacci(n-2);




    }

    public static boolean isValid(String s){
        char[] chars = s.toCharArray();
        boolean ka=false;
        if (s.contains(" ")==false){
        if(chars.length==5){
        for(int i=0;i<chars.length;i++){
            if (chars[i]>=0 || chars[i]<=9){ka=true;} else{ka=false;break;}
        }}}
        return ka;
    }

    public static boolean isStrangePair(String s1,String s2 ) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        boolean ka = false;
        if ((c1.length == 0) && (0 == c2.length)) {
            return true;
        } else {
            if ((c1[0] == c2[c2.length - 1]) && (c2[0] == c1[c1.length - 1])) {
                return true;
            } else {
                return false;
            }
        }
    }

    }




