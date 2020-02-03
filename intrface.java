interface pd
{
public void playsong();
}
interface cd
{
public void playsong();
}
class define implements pd,cd
{
public void playsong()
{
System.out.println("Your song is ready to play");
}
}
class intrface
{
public static void main(String arg[])
{
define x=new define();
x.playsong();
}
}