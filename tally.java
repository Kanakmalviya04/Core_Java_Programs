import java.util.Scanner;
class tally
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
dis=total*10/100;
MP=total-dis;
System.out.println("Total price is= "+total);
System.out.println("10% discount of total price= "+dis);
System.out.println("With discount MAIN PRICE is= "+MP);
}
}