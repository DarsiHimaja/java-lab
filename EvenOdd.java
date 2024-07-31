import java.util.*;
class EvenOdd
{
public static void main(String[]args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int a[] = new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]= scn.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]%2==0)
System.out.print(a[i] + " ");
}
for(i=0;i<n;i++)
{
if(a[i]%2 !=0)
System.out.print(a[i] + " ");
}
}
}
