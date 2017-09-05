import java.util.*;
public class ree
{
public static void main(String s[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(int i=1;i<a.length;i++)
{
if(a[0]==a[i])
{
System.out.print(a[i]+" ");
}
}
}
