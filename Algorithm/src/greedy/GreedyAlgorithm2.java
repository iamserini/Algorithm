package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyAlgorithm2 {

	public static void main(String[] args) {
		// 큰 수의 법칙
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(array); // 가장 큰 수와 두 번째로 큰 수를 구하기 위해 정렬
		
		//System.out.println(Arrays.toString(array));
		
		int first = array[n - 1];
		int second = array[n - 2];
		
		// 가장 큰 수와 두 번째로 큰 수가 더해질 때 반복되는 수열은 k+1
		// m/(k+1)의 경우 반복되는 수열의 횟수
		// ex) m이 8이고, k가 3일 경우 (6+6+6+5) + (6+6+6+5) => 2번
		// m/(k+1)에 다시 K를 곱하면 가장 큰 수의 횟수
		
		int x = (m / (k + 1))*k;
		x += m % (k + 1);
		
		//System.out.println(x);
		
		result += x * first;
		result += (m - x) * second;
		
		System.out.println(result);

	}

}
