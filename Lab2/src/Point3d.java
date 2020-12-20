import java.text.DecimalFormat;

public class Point3d extends Point2d {
    DecimalFormat decimalFormat = new DecimalFormat( "#.##" );

    private double zCoord;
    public Point3d(double x, double y, double z){

        super(x,y);
        zCoord = z;
    }
    public Point3d(){
        this(0,0,0);
    }
    public void setZ( double a){
        this.zCoord =a;
    }
    public double getZ(){
        return zCoord;
    }

    public boolean same(Point3d a){
        return (super.equal(a)&&(this.zCoord ==a.zCoord));
    }
    public double distanceTo(Point3d a){
        double i,j,k=0;
        i=this.getX()-a.getX();
        j=this.getY()-a.getY();
        k=this.getZ()-a.getZ();
        return (double) Math.sqrt((i*i+j*j+k*k));
        //return (double) Math.round(Math.sqrt((i*i+j*j+k*k))*100)/100;

    }
}