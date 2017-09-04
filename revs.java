import java.util.*;
public class fact
{
public static void main(String s[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String s1=String.valueOf(n);
String s2=new StringBuffer(s1).reverse().toString();
int s=Integer.parseInt(s2);
System.out.print(s);
}
}

