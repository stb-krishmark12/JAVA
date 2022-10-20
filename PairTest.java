class Pair<T>
{
T first;
T second;
Pair(){
first=null;
second=null;
}
Pair(T first, T second){
this.first= first;
this.second=second;
}
T getFirst(){
return first;
}
T getSecond(){
return second;
}
}
public class PairTest
{
public static void main(String[] ar){
Pair<String> ob1= new Pair<String>();
System.out.println("first is "+ob1.getFirst()+" second is "+ob1.getSecond());

Pair<String> ob2= new Pair<String>("Krishna", "yogi milkman");
System.out.println("first is "+ob2.getFirst()+" second is "+ob2.getSecond());

Pair<Integer> ob3= new Pair<Integer>(12,16);
System.out.println("first is "+ob3.getFirst()+" second is "+ob3.getSecond());

}
}