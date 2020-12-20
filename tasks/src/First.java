public class First {
    public static void main(String[] args) {

        //int a = Integer.parseInt(args[0]);
        //int b = Integer.parseInt(args[1]);
        //int c = Integer.parseInt(args[2]);
//        System.out.println(Remainder(2,1));
//        System.out.println(TriArea(2,1));
//        System.out.println(Animals(2,1,2));
//        System.out.println(ProfitableGamble(0.2,50,9));
//        System.out.println(Operation(2,1,2));
//        System.out.println(Ctoa("["));
//        System.out.println(AddUpTo(10));
//        System.out.println(NextEdge(8,10));
//        System.out.println(SumOfCubes(new int[]{1, 5, 9}));
//        System.out.println(AbcMath(5,2,2));
        
        switch (args[0]){
            case ("1"):{System.out.println(Remainder(Integer.parseInt(args[1]),Integer.parseInt(args[2]))); break;}
            case ("2"):{System.out.println(TriArea(Integer.parseInt(args[1]),Integer.parseInt(args[2]))); break;}
            case ("3"):{System.out.println(Animals(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])));break;}
            case ("4"):{System.out.println(ProfitableGamble(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3])));break;}
            case ("5"):{System.out.println(Operation(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])));break;}
            case ("6"):{System.out.println(Ctoa(args[1]));break;}
            case ("7"):{System.out.println(AddUpTo(Integer.parseInt(args[1])));break;}
            case ("8"):{System.out.println(NextEdge(Integer.parseInt(args[1]),Integer.parseInt(args[2])));break;}
            case ("9"):{System.out.println(SumOfCubes(new int[]{1, 5, 9}));break;}
            case ("10"):{System.out.println(AbcMath(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])));break;}
            default:
        }
    }
    
    public static int Remainder(int a,int b) { return a%b;}

    public static float TriArea(int a, int b){return a*b/2;}

    public static int Animals(int a, int b, int c){return a*2+(b+c)*4;}

    public static boolean ProfitableGamble(double prob, double prize, double pay){
        if(prob * prize > pay){return true;} else {return false;}
    }

    public static String Operation(int a, int b, int c){
        if(a+b==c){return "added";}
        else{
            if(a-b==c){return "subtracted";}
            else{
                if(a*b==c){return "multiplied";}
                else{
                    if(a/b==c){return "divided";}
                    else{return "none";}
                }
            }
        }
    }

    public static int Ctoa(String c){ char character = c.charAt(0); return (int) character;}

    public static int AddUpTo(int a){
        int sum=0;
        for(int i=1; i<=a;i++){ sum+=i;}
        return sum;
    }

    public static int NextEdge(int a,int b){return a+b-1;}

    public static int SumOfCubes(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+= a[i]*a[i]*a[i];
        }
        return sum;
    }

    public static boolean AbcMath(int a, int b, int c){
        for(int i=0;i<b;i++){
            a+=a;
        }
        if (a%c==0){return true;}else{return false;}
    }


}
