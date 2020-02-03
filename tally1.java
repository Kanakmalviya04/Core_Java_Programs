import java.util.Scanner;
class tally1
{
public static void main(String arg[])
{
float i1,i2,i3,total,dis,MP;
System.out.println("Enter the price of 3 items");
Scanner xy=new Scanner(System.in);
i1=xy.nextFloat();
i2=xy.nextFloat();
i3=xy.nextFloat();
total=i1+i2+i3;
if(total>=2000)
{
dis=total*10/100;
MP=total-dis;
System.out.println("CONGRATULATION you get 10% discount");
System.out.println("Total price is= "+total);
System.out.println("10% discount of total price= "+dis);
System.out.println("With discount MAIN PRICE is= "+MP);
}
else
{
System.out.println("you don't get any discount");
System.out.println("Total price is= "+total);
}
}
}