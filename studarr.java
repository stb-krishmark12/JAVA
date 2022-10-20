
import java.util.*;
public class studarr
{
String name;
int rollno;
static int s1,s2,s3,s4,s5;
static int total;
static float average;
static char grade=' ' ;

 studarr() 
{
this.name="unknown";
this.rollno=0;
this.s1= 0;
this.s2 = 0;
this.s3 = 0;
this.s4 = 0;
this.s5 = 0;

this.total =( s1+s2+s3+s4+s5)	;
this.average = (total/5);
}
public void setinfo(String name,int rollno, int s1,int s2,int s3,int s4,int s5,int total,float average,char grade)
{
this.name=name;
this.rollno=rollno;
this.s1= s1;
this.s2 = s2;
this.s3 = s3;
this.s4 = s4;
this.s5 = s5;

this.total =( s1+s2+s3+s4+s5)	;
this.average = (total/5);
if(s1>=50&&s2>=50&&s3>=50&&s4>=50&&s5>=50)
{
if(average>=50 && average<=60)
{
this.grade = 'D';
}

if(average>=61 && average<=70)
{
this.grade = 'C';
}

if(average>=71 && average<=80)
{
this.grade = 'B';
}

if(average>=81 && average<=90)
{
this.grade = 'A';
}

if(average>=91 && average<=100)
{
this.grade = 'O';
}


}
else
{
this.grade = 'F';
}

System.out.println("Grade = "+grade);

}

@Override
public String toString()
{
return "Student [name=" + name + ", rollno =" +rollno + "Total ="+total+"Grade="+grade+ "]";
}
public static void main(String[] args)
{
Scanner r = new Scanner(System.in);
System.out.println("Enter number of Students");
int sno = r.nextInt();
List<Student> stu=new ArrayList<>();
for(int i = 0; i<=sno;i++)
{
stu.add(new Student());
System.out.println("Enter student"+(i+1)+"name");
String Name = r.next();
System.out.println("Enter student"+(i+1)+"Marks");
int s1 = r.nextInt();
int s2 = r.nextInt();
int s3 = r.nextInt();
int s4 = r.nextInt();
int s5 = r.nextInt();
int rollno=i+1;
stu.get(i).setinfo(Name, rollno ,s1,s2,s3,s4,s5,total,average,grade);
}



for(Student s:stu)
{
System.out.println(s);
}
}
}
