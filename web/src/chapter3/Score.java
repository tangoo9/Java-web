package chapter3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드의 입력을 받습니다.
		String selected = null;
		String grade = null;
		int score = 0;
		
		System.out.println("i. if");// i. if	
		System.out.println("s. switch");// s. switch
		System.out.print("실행할 조건문을 선택하세요(i/s): ");// 실행할 조건문을 선택하세요(i/s): 
		selected = sc.nextLine(); // String selected = nextLine();
		if(selected.equals("i") || selected.equals("s")) {
			System.out.print("성적을 입력해주세요: ");
			grade = sc.nextLine();
			if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
				if(selected.equals("i")) {
					System.out.println("if문으로 연산");
					if(grade.equals("A")) {
						score = 90;
					} else if(grade.equals("B")) {
						score = 80;
					} else if(grade.equals("C")) {
						score = 70;
					} else if(grade.equals("D")) {
						score = 60;
					} else {
						score = 0;
					}
				}else {
					System.out.println("switch문으로 연산");
					switch(grade) {
						case "A":
							score = 90;
							break;
						case "B":
							score = 80;
							break;
						case "C":
							score = 70;
							break;
						case "D":
							score = 60;
							break;
						default :
							score = 0;
					}
				}

				if(grade.equals("A")) {
					System.out.println(grade + "등급은 "+ score + " ~ " + (score+10) + "점입니다.");
				} else if(grade.equals("F")) {
					System.out.println(grade + "등급은 "+ score + " ~ " + (score+59) + "점입니다.");
				} else {
					System.out.println(grade + "등급은 "+ score + " ~ " + (score+9) + "점입니다.");
				}
				
			}else {
				System.out.println("<입력오류!>");
			}
		} else {
			System.out.println("<입력오류!>");
		}
		// 만약에 i를 입력받으면 if문을 사용하여 성적을 처리
		// 만약에 s를 입력받으면 switch문을 사용하여 성적을 처리
		// i, s가 아닌 다른 값이 들어오면 <입력오류!>를 출력
		
		
		// 성적을 입력해주세요: 
		// String grade = nextLine();
		// grade != A,B,C,D,F
		// 이 범위를 벗어나면 <입력오류!>를 출력
		
		// grade == A이면 score == 90 ~ 100
		// grade == B이면 score == 80 ~ 89
		// grade == C이면 score == 70 ~ 79
		// grade == D이면 score == 60 ~ 69
		// grade == F이면 score == 0 ~ 59
		
		// grade등급은 [score의 범위]점입니다.
		// A등급은 90 ~ 100점입니다.
		
		
		

	}

}
