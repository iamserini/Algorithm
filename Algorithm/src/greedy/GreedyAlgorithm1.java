package greedy;

import java.util.Scanner;
class GreedyAlgorithm1 {

	public static void main(String[] args) {
		// 거스름돈
		// 500원, 100원, 50원, 10원. 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러 줘야 할 동전의 최소 개수를 구하라.
		//  단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
		
		int[] change = {500, 100, 50, 10};
		int cnt = 0;
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		
		for (int i = 0; i < change.length; i++) {
			int coin = change[i];
			cnt += n / coin;
			n %= coin;
		}
		
		System.out.println("최소 개수 : " + cnt);

	}

}
