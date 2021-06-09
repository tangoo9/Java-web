package chapter4;

import java.util.Scanner;

public class ArrayEx8_Student {

	public static void main(String[] args) {
		final int STUDENT_MAX = 20;
		
		Scanner sc = new Scanner(System.in);
		boolean mloop = true;
		
		String[] schoolName = new String[STUDENT_MAX];
		int[] schoolYear = new int[STUDENT_MAX]; //학년
		String[] studentName = new String[STUDENT_MAX];
		
		int stCount = 0;
		
		schoolName[0] = "대성중학교";
		schoolName[1] = "부산중학교";
		schoolName[2] = "대성고등학교";
		schoolName[3] = "부산고등학교";
		schoolName[4] = "부경대학교";
		schoolName[5] = "부산대학교";
		schoolName[6] = "대성중학교";
		schoolName[7] = "부산중학교";
		schoolName[8] = "대성고등학교";
		schoolName[9] = "부산고등학교";
		schoolName[10] = "부경대학교";
		schoolName[11] = "부산대학교";
		
		schoolYear[0] = 1;
		schoolYear[1] = 3;
		schoolYear[2] = 2;
		schoolYear[3] = 2;
		schoolYear[4] = 3;
		schoolYear[5] = 3;
		schoolYear[6] = 3;
		schoolYear[7] = 3;
		schoolYear[8] = 2;
		schoolYear[9] = 1;
		schoolYear[10] = 4;
		schoolYear[11] = 4;
		
		studentName[0] = "김준일";
		studentName[1] = "권혁인";
		studentName[2] = "김상우";
		studentName[3] = "김태우";
		studentName[4] = "박용수";
		studentName[5] = "박지호";
		studentName[6] = "배현준";
		studentName[7] = "손효현";
		studentName[8] = "안대양";
		studentName[9] = "유정무";
		studentName[10] = "이은수";
		studentName[11] = "최종원";
		
		while(mloop) {
			for(int i = 0; i < STUDENT_MAX; i++) {
				if(studentName[i] == null && schoolYear[i] == 0 && schoolName[i] == null) {
					stCount = i;
					break;
				}
			}
			System.out.println("학교 관리 시스템");
			System.out.println("------------------");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("q. 프로그램 종료");
			System.out.println("------------------");
			System.out.print("명령을 선택해 주세요: ");
			String select = sc.nextLine();
			System.out.println();
			
			if(select.equals("1")) {
				System.out.println("학생 정보 입력 메뉴");
				System.out.print("학교명: ");
				schoolName[stCount] = sc.nextLine();
				System.out.print("학년: ");
				schoolYear[stCount] = Integer.parseInt(sc.nextLine());
				System.out.print("이름: ");
				studentName[stCount] = sc.nextLine();
				System.out.println("학생 정보 입력이 성공적으로 이루어졌습니다.\n");
			}else if(select.equals("2")) {
				boolean sLoop = true;
				while(sLoop) {
					System.out.println("학생 정보 출력 메뉴");
					System.out.println("-------------------");
					System.out.println("1. 전체 출력");
					System.out.println("2. 이름으로 검색");
					System.out.println("3. 학교로 검색");
					System.out.println("b. 뒤로가기");
					System.out.println("-------------------");
					System.out.println("명령을 선택해 주세요: ");
					select = sc.nextLine();
					System.out.println();
					if(select.equals("1")) {
						System.out.println("학생 전체 조회");
						System.out.println("--------------");
						for(int i = 0; i < STUDENT_MAX; i++) {
							if(studentName[i] != null ? true : false) {
								System.out.println("학교명: " + schoolName[i]);
								System.out.println("학년: " + schoolYear[i]);
								System.out.println("이름: " + studentName[i]);
								System.out.println();
							}
						}
					} else if(select.equals("2")) {
						System.out.println("이름으로 검색");
						System.out.println("--------------");
						System.out.print("검색할 이름: ");
						String name = sc.nextLine();
						
						for(int i = 0; i < STUDENT_MAX; i++) {
							if(studentName[i] != null ? studentName[i].equals(name) : false) {
								System.out.println("학교명: " + schoolName[i]);
								System.out.println("학년: " + schoolYear[i]);
								System.out.println("이름: " + studentName[i]);
								System.out.println();
							}
						}
					} else if(select.equals("3")) {
						System.out.println("학교명으로 검색");
						System.out.println("--------------");
						System.out.print("검색할 학교명: ");
						String name = sc.nextLine();
						
						for(int i = 0; i < STUDENT_MAX; i++) {
							if(schoolName[i] != null ? schoolName[i].equals(name) : false) {
								System.out.println("학교명: " + schoolName[i]);
								System.out.println("학년: " + schoolYear[i]);
								System.out.println("이름: " + studentName[i]);
								System.out.println();
							}
						}
					} else if(select.equals("b")) {
						sLoop = false;
					} else {
						System.out.println("<입력오류!>\n");
					}
				}
				
			}else {
				System.out.println("<입력오류!> 명령어는 1, 2, q만 입력이 가능합니다.\n");
			}
		}

	}

}
