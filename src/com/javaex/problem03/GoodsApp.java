 package com.javaex.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		ArrayList<Goods> goods = new ArrayList<Goods>();
	
		System.out.println("상품 3개를 입력해주세요");
		Scanner sc = new Scanner(System.in); 
		int sum=0;
		
		for(int i=0; i<3; i++) {
			
			//String 타입의 문자열 입력받기
			String str = sc.nextLine(); 
			goods.add(new Goods(str.split(" ")[0], Integer.parseInt(str.split(" ")[1]), Integer.parseInt(str.split(" ")[2])));
			
			
			
			
			sum += Integer.parseInt(str.split(" ")[2]);
		}
		for(int i=0; i<3; i++) {
			goods.get(i).showinfo();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
}
}