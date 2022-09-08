// Function with no return type & no argument
class BoxVolume
{
    double height,width,depth;
    void Volume()
    {
        height=10.1;
        width=12.2;
        depth=5.6;
        System.out.println("The Volume of the cuboid is :- "+height*width*depth);
    }
}
public class Program56 
{
    public static void main(String[] args) 
    {
        BoxVolume obj=new BoxVolume();
        obj.Volume();   
    }   
}