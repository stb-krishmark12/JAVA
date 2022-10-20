import java .util.*;
public class SumOfDigits
{
public static void main(String[]args)
{
long sum;

Scanner s= new Scanner(System.in);
System.out.println("Enter number");

long n = s.nextInt();

sum = (n%9==0)?9:n%9;
System.out.println("The sum is "+sum);
}
}