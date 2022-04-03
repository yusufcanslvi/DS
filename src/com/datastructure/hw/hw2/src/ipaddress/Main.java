package ipaddress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		IPAdress [] ipArray=new IPAdress[1000]; 
		Scanner scanner = new Scanner(new File("adresses.csv"));
		int k=0;
		while(scanner.hasNextLine() && k<ipArray.length) {
			
			String value=scanner.nextLine();
			String newValue=value.replace("\"", "");
			String [] load=newValue.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			ipArray[k]=new IPAdress(Long.parseLong(load[0]), Long.parseLong(load[1]), load[2], load[3], load[4], load[5]);
			load=null;
			k++;
			
		} scanner.close();
		
		long start=System.currentTimeMillis();
		BubbleSort.sort(ipArray);
		/*
		for (IPAdress item : ipArray) {
			System.out.println(item);
		} 
		System.out.println("\n");
		System.out.println("---------"); */
		FileWriter filewriter=new FileWriter(new File("results.txt"));
		for (IPAdress item: ipArray) {
		filewriter.write(item.toString()+"\n");
		}
		filewriter.close();
		System.out.println("Done! sent to txt file");
		System.out.println("time taken : "+(System.currentTimeMillis()-start)+" ms");
		System.out.println("# of sorted addresses: "+k);
		
	}
	
	

}
