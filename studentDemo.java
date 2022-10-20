  
class Student 
{
private String name ;
private int id;

public void setname(String name)
{
this.name = name;
}

public void setid(int id)
{
this.id = id;
}

public String getname()
{
return name;
}

public int getid()
{
return id;
}
}

public class studentDemo
{
public static void main(String[]args)
{
Student s1= new Student();
s1.setname("Gowtham");
s1.setid(123);
System.out.println("Name is "+s1.getname()+" Id is  "+s1.getid());
}
}


