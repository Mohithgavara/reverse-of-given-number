import java.util.*;
class reverseorder
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
while(a>=b)
{
if(a%2==0)
System.out.println(" "+a);
a--;
}
}
}