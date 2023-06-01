//import java.util.Arrays;

public class Median {
public static void main(String[] args) {
int[] a = {7, 17, 9, 3, 2, 10};

//Arrays.sort(a);//sort an element in ascending order

//System.out.print("Sorted array: ");
//for (int i = 0; i < a.length; i++) {

//System.out.print(a[i] + " ");//Sorted array: 2 3 7 9 10 17 
//}
//System.out.println();
int a1=a[a.length/2];//arr[3]=9
int a2=a[a.length/2-1];//arr[2]=7
int a3=(a1+a2)/2;
System.out.println("The index value of a[2] is "+a2);
System.out.println("The index value of a[3] is "+a1);
System.out.println("The median value of these element is  "+a3);
}
}


