public class Primes {

    public static boolean IsPrime(int k) {
        for (int i=2;i<k;i++){
            if ((k%i)==0){return false;}
        }
        return true;
    }


    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if (IsPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
