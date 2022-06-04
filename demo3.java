import java.util.Scanner;
class test3
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("enter length");
int x=s.nextInt();
 System.out.println("enter breadth");
int y=s.nextInt();

if(x==y)
{
 System.out.println("square");
}
else
{
System.out.println("rectangle");
}


}
}