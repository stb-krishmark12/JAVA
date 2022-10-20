import java.util.Scanner;
public class Vowels{
public static void main(String[] agrs){
char ch;
Scanner s = new Scanner(System.in);
ch=s.next().charAt(0);
char [] arr = new char[5];
arr[0]='a';
arr[1]='e';
arr[2]='i';
arr[3]='o';
arr[4]='u';
for(int i = 0; i<5;i++)
{
if(ch==arr[i])
{

System.out.println("It is a vowel");

}

}
}
}
