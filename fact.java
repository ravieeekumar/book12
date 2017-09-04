import java.util.*;
public class fact
{
public static void main(String s[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int fac=1;
for(int i=1;i<=n;i++)
{
fac=fac*i;
}
System.out.print(fac);
}
}
