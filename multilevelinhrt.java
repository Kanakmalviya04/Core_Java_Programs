class base
{
public int a=5,b=14;
}
class derived1 extends base
{
public int sum,mul;
}
class derived2 extends derived1
{
public void show()
{
int sum=a+b;
System.out.println("ADDITION is : "+sum);
int mul=a*b;
System.out.println("MULTIPLICATION is : "+mul);
}}
class multilevelinhrt
{
public static void main(String ar[])
{
derived2 s1=new derived2();
s1.show();
}
}