// Function with return type & no argument
class BoxVolume
{
    double height,width,depth;
    double Volume()
    {
        height=10.1;
        width=12.2;
        depth=5.6;
        double ans=height*width*depth;
        return ans;
    }
}
public class Program57 
{
    public static void main(String[] args) 
    {
        BoxVolume obj=new BoxVolume();
        double x=obj.Volume();  
        System.out.println("The Volume of the cuboid is :- "+x);
    }   
}