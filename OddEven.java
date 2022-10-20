import java.util.*;
public class OddEven{
public static void main(String args[]){
int n,i;
Scanner s= new Scanner(System.in);
System.out.println("Enter the number of elements:");
n=s.nextInt();
int[] num=new int[n];
for(i=0;i<num.length;i++){
System.out.println("Enter the number:");
num[i]=s.nextInt();
}
for (i=0;i<num.length;i++){
if(num[i]%2!=0){
System.out.println(num[i]+ " is odd number");
}
}
for(i=0;i<num.length;i++){
if(num[i]%2==0){
System.out.println(num[i]+ " is even number");
}
}
}
}