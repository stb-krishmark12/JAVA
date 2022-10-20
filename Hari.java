import java.util.Scanner;
public class Hari{
public static void main(String[] args){
char ch;
Scanner n=new Scanner(System.in);
ch=n.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println("It is Vowel");
else
System.out.println("It is not a vowel");
}
}