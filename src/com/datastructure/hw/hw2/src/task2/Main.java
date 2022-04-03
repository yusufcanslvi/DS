package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import ipaddress.IPAdress;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		IPAdress [] ippArray= new IPAdress[100];
		Scanner scanner = new Scanner(new File("rezultati.txt"));
		
		int p=0;
		while(scanner.hasNextLine() && p<ippArray.length) {
			
			String value=scanner.nextLine();
			String newValue=value.replace("\"", "");
			String [] load=newValue.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			ippArray[p]=new IPAdress(Long.parseLong(load[0]), Long.parseLong(load[1]), load[2], load[3], load[4], load[5]);
			load=null;
			p++;
			
		} scanner.close();

		System.out.println("type ip address in x.x.x.x format");
		Scanner s=new Scanner(System.in);
		String v=s.next();
		String [] input=v.split("\\.");
		
		long w=Long.parseLong(input[0])*16777216;
		long x=Long.parseLong(input[1])*65536;
		long y=Long.parseLong(input[2])*256;
		long z=Long.parseLong(input[3]);
		long result=w+x+y+z;
		System.out.println(BinarySearch.search(ippArray, result));
		
		s.close();
		
		
	

	}

}
