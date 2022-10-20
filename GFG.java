
import java.util.*;
class GFG 
{
    public static void main (String[] args) 
    {      
Scanner n=new Scanner(System.in);   

int yogesh[];
yogesh=new int[10];  
 System.out.println("Enter the input");     
for(int j=0;j<yogesh.length;j++)
{
yogesh[j]=n.nextInt();
}
for (int i = 0; i < yogesh.length; i++)
{
if(yogesh[i]%2==0)

{
 System.out.println(yogesh[i]+ " is even number");          
 }
}
for (int k = 0; k < yogesh.length; k++)
{
if(yogesh[k]%2!=0)
{
System.out.println(yogesh[k]+ "is odd number");      
}
}
}
}