import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую точку");

        double a1 = scan.nextDouble();
        double a2 = scan.nextDouble();
        double a3 = scan.nextDouble();
        Point3d a = new Point3d(a1,a2,a3);
        System.out.println("Введите вторую точку");
        a1 = scan.nextDouble();
        a2 = scan.nextDouble();
        a3 = scan.nextDouble();
        Point3d b = new Point3d(a1,a2,a3);
        System.out.println("Введите третью точку");
        a1 = scan.nextDouble();
        a2 = scan.nextDouble();
        a3 = scan.nextDouble();
        Point3d d = new Point3d(a1,a2,a3);
        if(a.same(b)||a.same(d)||b.same(d)){System.out.println("incorrect input");} else{System.out.println(computeArea(a,b,d));}
    }
    public static double computeArea(Point3d a,Point3d b, Point3d c){
        double p=0.5*(a.distanceTo(b)+a.distanceTo(c)+b.distanceTo(c));
        return (double) Math.sqrt(p*(p-a.distanceTo(b))*(p-a.distanceTo(c))*(p-c.distanceTo(b)));
        //return (double) Math.round(Math.sqrt(p*(p-a.distanceTo(b))*(p-a.distanceTo(c))*(p-c.distanceTo(b)))*100)/100;
    }
}
