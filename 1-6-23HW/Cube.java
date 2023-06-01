public class Cube
{
public static void main(String arg[])
{
int a=20;//in cubic centimeter
int cube=a*a*a;
System.out.println("The cube value is "+cube);

int l=2;//length =2m;
double w=1.5;//length=1.5m;
int h=1;//height=1m;
double rec=l*w*h;
double rec1=1000000*rec;//1 cubic cm=1000000 cubic m;
System.out.println("The volume of rectange is "+rec1);
double box=rec1/cube;
System.out.println(box+ " boxes can store");
}
}
