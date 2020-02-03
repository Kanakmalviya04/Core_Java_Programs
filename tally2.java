import java.util.Scanner;
class tally2
{
public static void main(String arg[])
{
int i1,i2,i3,i4,i5,total;
float dis1,dis;
System.out.println("Enter the prices of 5 Items");
Scanner x=new Scanner(System.in);
i1=x.nextInt();
i2=x.nextInt();
i3=x.nextInt();
i4=x.nextInt();
i5=x.nextInt();
total=i1+i2+i3+i4+i5;
if(total>=2000)
{
dis1=total*10/100;
dis=total-total*10/100;
System.out.println("Your total billing amount is = "+total);
System.out.println("Your total 10 discount price is = "+dis1);
System.out.println("With DISCOUNT of 10% Your total Bill is ="+dis);
}
else if(total>=500)
{
dis1=total*5/100;
dis=total-total*5/100;
System.out.println("Your toatl billing amount is = "+total);
System.out.println("Your total 5% discount price is = "+dis1);
System.out.println("With DISCOUNT of 5% Your total Bill is ="+dis);
}
else
{
System.out.println("Your toatl billing amount is = "+total);
System.out.println("You don't get any DISCOUNT");
}
}
}