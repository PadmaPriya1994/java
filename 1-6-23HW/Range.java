public class Range
{
public static void main(String args[])
{
int a[]={7,17,9,3,2,10};
int min=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}

}
System.out.println("min "+min);
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("max "+max);


System.out.println(max-min);
}
}
