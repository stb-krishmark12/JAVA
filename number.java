import java.util.*;
public class number
{
public static void main(String []args)
{
Scanner s = new Scanner(System.in);
String input = s.nextLine();
int n = Integer.parseInt(input);
System.out.println(prime(n));
 number n1 = new number();
}

public int prime(int n)
{
int i,m=0,flag=0;
m = n/2;
if(n==0||n==1)
{
flag = 1;
}
else
{
for(int j = 2; j<=n;j++)
{
boolean isPrime = true;
for(int i = 2 ; i<=m; i++)
{
if(n%i==0){
isPrime = false;
break;
}
}
if ( isPrime == true)
{
return n;
}
}
}
}

