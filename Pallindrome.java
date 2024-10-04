import java.util.*;
 class Pallindrome {
    public static void main(String[]args){
    System.out.println("enter any string to check it is pallindrome or not:");
    Scanner sc=new Scanner(System.in); 
    String name=sc.next();
    int len=name.length();
    String n="";
    int i;
    for(i=len-1;i>=0;i--)
    {
        n=n+name.charAt(i);
    }
    if(name.equals(n))
     {
        System.out.println("palindrome");
     }
    else{
        System.out.println("not a pallindrome");
    }
 }
 }

