package algorithm;

import java.util.Scanner;

public class Leap_year {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		if(yr%4 == 0) {
			if(yr%100==0 && yr%400!=0) {
				System.out.println("0");
			}else if(yr%400 ==0){
				System.out.println("1");
			}else {
				System.out.println("1");
			}
		}else {
			System.out.println("0");
		}
	}
}

/*
 * 연도가 주어졌을 때,윤년이면 1,아니면 0 을 출력하는 프로그램을 작성하시오.
 * 
 * 윤년은 연도가 4의 배수이면서,100 의 배수가 아닐 때 또는 400 의 배수일 때이다.
 * 
 * 예를 들어,2012 년은 4 의 배수이면서 100 의 배수가 아니라서 윤년이다.1900 년은 100 의 배수이고 400 의 배수는 아니기
 * 때문에 윤년이 아니다.하지만,2000 년은 400 의 배수이기 때문에 윤년이다 .
 */