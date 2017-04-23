import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class IsPrime{

	public static void main(String[] args)throws Exception{
Long userinput=0.0, maxinput=0.0;
	boolean result=true; //true means number is prime.
		String name="";
System.out.println("Enter an integer: ");  
name=System.console().readLine(); 
System.out.println("number is "+name);
//value1 = Integer.valueof(na
userinput= Long.parseLong(name);
	maxinput=(userinput/2)+1;
	int j=maxinput.intValue();
	System.out.println("Value of j "+j);
		for(int count=2; count<=j;count++){
			if(userinput%count==0){
			result=false;
			}
		}
String s1=Boolean.toString(result);
		System.out.println(s1);		   
}}

 
