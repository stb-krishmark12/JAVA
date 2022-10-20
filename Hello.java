import java.util.*;
 class Hello
{
public static void main(String[]args)
{
String name;
int age;

System.out.println("Hello world");
Scanner i = new Scanner(System.in);
System.out.println("Enter name :");
name = i.next();
System.out.println("Enter age:");
age = i.nextInt();

System.out.println(name);
System.out.println(age);
}
}
