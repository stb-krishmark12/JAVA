import java.util.*;
class repetations {
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter array size");
int size = s.nextInt();


int A[] ;
A=new int [size];
System.out.println("Enter inputs");
for(int k=0;k<size;k++)
{
A[k]=s.nextInt();
}
 int max = Integer.MIN_VALUE;// -23456...
 for (int i = 0; i < size; i++)
{
 if (A[i] > max)
 max = A[i];
}
 int B[] = new int[max+1 ];//11 0 places 
 for (int i = 0; i < size; i++) 
{
 B[A[i]]++;
}
 for (int i = 0; i <= max; i++) 
{
  if (B[i] > 1)
  System.out.println(i + " is repeated " + B[i]+" time(s)");
  else
  System.out.println(i + " is repeated " +"0 time(s)");
}

}
}

