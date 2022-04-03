package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class djikstraTwoStack<Item> {
	lab2_Stack<Integer> values;
	lab2_Stack<String> operands;
	
	
	public djikstraTwoStack() {
		super();
		this.values =  new lab2_Stack<Integer>();
		this.operands = new lab2_Stack<String>();
	}
	

	public void start() {
		Scanner sc = new Scanner(System.in);
		String expression;
		System.out.println("Enter an expression:");
		expression = sc.nextLine();
		sc.close();
		String[] elems = expression.split(" ");
		String[] operands = new String[]{"+","-","/","*","%"};
		List<String> ops = new ArrayList<>(Arrays.asList(operands));
		int i=0;
		
		while (i < elems.length) {
			
			if(elems[i].equals("(")){
				i++;
				continue;
			} else if(elems[i].equals(")")){
				stackEvaluate();
			} else if(ops.contains(elems[i])) {
				this.operands.push(elems[i]);
			} else {
				try {
			    values.push(Integer.parseInt(elems[i])); 
			    } catch (Exception e) {
			    	System.out.println("Expression not interpreted.");
			    	throw new NumberFormatException("Enter expression in proper format.");
					}
				}
			i++;
			
			}
		
		System.out.println("Result : " + this.values.pop());
		
	}
	
	
	public void stackEvaluate() {
		String op = operands.pop();
		Integer x = this.values.pop();
		Integer y = this.values.pop();
		switch (op) {
		case "+":
			this.values.push(y+x);
			break;
		case "-":
			this.values.push(y-x);
			break;
		case "*":
			this.values.push(y*x);
			break;
		case "/":
			this.values.push(y/x);
			break;
		case "%":
			this.values.push(y%x);
			break;
		}	
	}
}

