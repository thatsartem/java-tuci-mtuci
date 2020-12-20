import java.util.HashSet;
import java.util.Set;

public class Third {
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are compressed"));
        System.out.println(checkPerfect(28));
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(isValidHexCode("CD5C5C"));
        System.out.println(same(new int[]{1, 5, 9},new int[]{2, 2, 2,3,4,4}));
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

}
