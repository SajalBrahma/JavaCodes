// Function with return type & argument
class BoxVolume
{
    double height,width,depth;
    double Volume(double h,double w,double d)
    {
        height=h;
        width=w;
        depth=d;
        double ans=height*width*depth;
        return ans;
    }
}

public class Program59 
{
    public static void main(String[] args) 
    {
        BoxVolume obj=new BoxVolume();
        double x=obj.Volume(10.1,12.2,5.6);  
        System.out.println("The Volume of the cuboid is :- "+x);
    }   
}