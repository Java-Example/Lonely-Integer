import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class LonelyInteger{
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		ArrayList<Integer> number = new ArrayList<Integer>();
		String str="";
		int val,n;

		for(int i=0;i<no_of_testcase;i++)
		{
			val=s.nextInt();
			number.add(val);
		}
		
		for(int j=0;j<number.size();j++)
		{
			n=0;
			for(int k=j+1;k<number.size();k++)
			{
				if(number.get(j)==number.get(k))
				{
					number.remove(k);
					k--;
					n=1;
				}
			}
			if(n==1){
				number.remove(j);
				j--;
			}
			
		}
		for(int l=0;l<number.size();l++)
			str+=number.get(l)+" ";
		
		System.out.print(str);
	}
}
