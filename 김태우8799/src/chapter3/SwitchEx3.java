package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//徹左球税 脊径聖 閤柔艦陥.
		//int rank = nextLine();
		//int = 1,2,3 葵 猿走 閤聖呪赤製 , 背雁葵戚 焼艦檎 <脊径神嫌!> 窒径
		
		//Switch ~ case研 彰陥.
		//什是暢 奄層葵精 rank
		//1去精 榎五含
		//2去精 精五含
		//3去精 疑五含
		//char medalcolor = '榎', '精', '疑'
		//rank 去精 medalcolor 五含脊艦陥.
		//1去精 榎五含 脊艦陥.
		
		//嬢巨辞 何昔杏猿..
		Scanner sc = new Scanner(System.in);
		
		int rank = Integer.parseInt(sc.nextLine());
		char medalColor = 0;
		
		System.out.print("去呪研 脊径馬室推 : ");
		sc.nextLine();
		
						
		if(rank < 0 || rank > 3){
			System.out.println("<脊径神嫌!>");
		}
		else { 
			switch(rank){
			case 1 :
		//		rank = 1; // 戚 痕呪識情 琶推蒸製 せせせせせせせせせせせせ 嬢託杷 是拭 case 1戚 稲 rank葵聖 税耕馬澗暗奄 凶庚拭 せせせ�擇擦� 
				medalColor = '榎';
		//		System.out.println(rank + "去精 " + medalColor +"五含脊艦陥."); //戚依亀 唖唖 背匝 琶推亜 蒸製 埴せせせ 
				break;
			case 2 :
		//		rank = 2; // 戚 痕呪識情 琶推蒸製 せせせせせせせせせせせせ
				medalColor = '精';
		//		System.out.println(rank + "去精 " + medalColor +"五含脊艦陥.");
				break;
			case 3 : 
		//		rank = 3; 戚 痕呪識情 琶推蒸製 せせせせせせせせせせせせ
				medalColor = '疑';
		//		System.out.println(rank + "去精 " + medalColor +"五含脊艦陥.");
				break;
				}	
			
			}
		 System.out.println(rank + "去精 " + medalColor +"五含脊艦陥.");
}
	
}