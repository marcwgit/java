import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;
public class EX11BP3 {

	public static void main(String[] args)throws Exception
	{
		
		 InputStreamReader r=new InputStreamReader(System.in);  
		 BufferedReader br=new BufferedReader(r); 
		// TODO Auto-generated method stub

int firstinteger, secondinteger, gcf, lowernumber;

System.out.println("Enter an integer: ");  
name=br.readLine(); 
System.out.println("number is "+firstinteger);
//value1 = Integer.valueof(name);
firstinteger = Integer.parseInt(name);

System.out.println("Enter an integer"); 
name =br.readLine();
System.out.println("number is "+secondinteger);
//value2 = Integer.valueof(name);
secondinteger = Integer.parseInt(name);

if(firstinteger>=secondinteger){
lowernumber=secondinteger;}
if(firstinteger<=secondinteger){
lowernumber=secondinteger;}
for(count=lowernumber;count--){
=firstinteger/count
