package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	List<Friend> friendArray = new ArrayList <Friend>();
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		//친구정보 입력받기
       for(int i=0; i<3;i++) {
    	//String 타입의 문자열 입력받기
    	  String input=sc.nextLine();
    	 //입력받은 친구정보 공백으로 분리
    	  String inputArray[]=input.split(" ");
    	//Friend 객체 생성하여 배열에 추가하기
    	  Friend friend=new Friend(inputArray[0],inputArray[1], inputArray[2]);
    	  friendArray.add(friend);
//    	  friend.setName(inputArray[0]);
//    	  friend.setHp(inputArray[1]);
//    	  friend.setSchool(inputArray[2]);
//    	  friendArray.add(friend);
       }
       
       for(int i=0; i<3; i++) {
    	   friendArray.get(i).showInfo();
       }
       
    }

}
