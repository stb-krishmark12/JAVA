 
import java.util.*;
public class AlDemo{
public  static void main(String[] args){
ArrayList al1=new ArrayList();
al1.add(10);
al1.add("demo");
al1.add(0.50);
String a;
a = (String)al1.get(1);
System.out.println(a);
//System.out.println(al1.get(0));
//System.out.println(al1.get(1));
//System.out.println(al1.get(2));
ArrayList<String> al2=new ArrayList<String>();
al2.add("demo2");
String cst = al2.get(0);
System.out.println(cst);
//al2.add(5);
}
}