public class OneToHunOdd
{
public static void main(String args[])
{
int a[]={1,55,6,7,88,9,2,3,90,323,456,767,5};
System.out.println("The odd numbers are ");
for(int i=0;i<a.length;i++)
{
if(a[i]<=100 && a[i]%2==1)//if(a[i]<=100 && a[i]%2!=0)
{
System.out.println(a[i]);
}
}


// Even number 
System.out.println("The even numbers are ");
for(int i=0;i<a.length;i++)
{
if(a[i]<=100 && a[i]%2==0)//if(a[i]<=100 && a[i]%2!=0)
{
System.out.println(a[i]);
}
}
}
}
