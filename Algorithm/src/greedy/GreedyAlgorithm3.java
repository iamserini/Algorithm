package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyAlgorithm3 {

	public static void main(String[] args) {
		// 숫자 카드 게임
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] array  = new int[row][col];
		int max = 0;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		for(int i = 0; i < row; i++) {
			Arrays.sort(array[i]);
		}
		
		for(int i = 0; i < row; i++) {
			if(array[i][0] > max)
				max = array[i][0];
		}
		
		System.out.println(max);

	}

}
