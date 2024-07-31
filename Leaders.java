import java.util.*;
class Leaders{
public static void main(String[]args)
{
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int a[] = new int[n];
int i,j,max,res;
 for(i=0;i<n;i++)
a[i]= scn.nextInt();
for(i=0;i<n-1;i++)
{
max=a[i];
for(j=i+1;j<n;j++)
{
 if(a[j]>max)
  max= a[j];
 }
if(a[i]==max)
System.out.println(max);
}
}
}