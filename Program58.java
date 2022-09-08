// Function with no return type & argument
class BoxVolume
{
    double height,width,depth;
    void Volume(double h,double w,double d)
    {
        height=h;
        width=w;
        depth=d;
        System.out.println("The Volume of the cuboid is :- "+height*width*depth);
    }
}
public class Program58 
{
    public static void main(String[] args) 
    {
        BoxVolume obj=new BoxVolume();
        obj.Volume(10.1,12.2,5.6);  
    }   
}