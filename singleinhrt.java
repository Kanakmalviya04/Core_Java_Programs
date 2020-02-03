class student
{
public String name="KANAK";
public int id=214214;
public int age=21;
}
class info extends student
{
public void show()
{
System.out.println("The name of student is : "+name);
System.out.println("The ID of student is : "+id);
System.out.println("The age of student is : "+age);
}}
class singleinhrt
{
public static void main(String arg[])
{
info a1=new info();
a1.show();
}
}