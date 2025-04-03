import java.lang.Math;
public class EarthVolume{
public static void main(String[] args){
 int r=6378;
 double volume=(4.0/3)*Math.PI*Math.pow(r,3);
System.out.println( "The volume of earth in cubic kilometers is "+volume+" and cubic miles is "+(volume/0.239913));

}
}