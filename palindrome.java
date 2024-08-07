import java.util.*;
class Palindrome{
public static void main(String[]args)
{
Scanner scn = new Scanner(System.in);
String str = scn.nextLine();
int i=0;
if(str.length()==0)
  return;
else
{
 palindrome(str,0);
boolean b = palindrome(str,i);
if(b==true)
   System.out.println("Palindrome");
else
   System.out.println("Not a palindrome");
}
}

public static boolean palindrome(String str,int i)
{
int n=str.length(); 
if(str.length() == 1 || str.length()==0)
    return true;
else
   if(str.charAt(i) == str.charAt(n-1))
       return palindrome( str.substring(i,n-1), i+1);
return false;
}
}