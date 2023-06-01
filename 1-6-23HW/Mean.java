public class Mean
{
public static void main(String arg[])
{
int sum=0;
int a[]={7,17,9,3,2,10};
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
int mean=sum/a.length;
System.out.println("Mean value of {7,17,9,3,2,10} "+mean);
}
}

