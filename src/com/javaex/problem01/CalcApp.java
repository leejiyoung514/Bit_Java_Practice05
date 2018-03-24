package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		int num1, num2;
		String cal;
		

		Scanner sc = new Scanner(System.in);
		Integer p01 = 0;
		Integer p02 = 0;
		

		while (true) {
			System.out.print(">>");

			String input = sc.nextLine();

			String inputArray[] = input.split(" ");
			
			if(inputArray[0].equals("/q")){
				System.out.println("종료합니다.");
				break;
			}
			
			num1 = p01.parseInt(inputArray[0]);
			num2 = p01.parseInt(inputArray[2]);

			
			
			
			switch (inputArray[1]) {
			case "+":
				Add add = new Add();
				add.setValue(num1, num2);
				System.out.println(">>" + add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				System.out.println(">>" + sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				System.out.println(">>" + mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(num1, num2);
				System.out.println(">>" + div.calculate());
				break;
			default:
				System.out.println("알 수 없는 연산입니다.");
				break;
			}

		}
	}

}
