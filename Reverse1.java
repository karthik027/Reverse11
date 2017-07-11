# Reverse11
import java.util.*;
import java.io.*;
public class Reverse1
{  
  public static void main(String[] args)  
  {  
    int c=0,a,temp; 
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    temp=n;  
    while(n>0)  
    {  
      a=n%10;  
      n=n/10;  
      c=(c*10)+a; 
      
    }
    System.out.print(c);  
    
  }  
}  
