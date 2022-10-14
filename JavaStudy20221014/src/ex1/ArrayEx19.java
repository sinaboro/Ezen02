package ex1;

public class ArrayEx19 {
	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } 
		};
		// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int total = 0;

		System.out.println("번호   국어   영어   수학     총점     평균 ");
		System.out.println("=============================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0; // 개인별 총점
			float avg = 0.0f; // 개인별 평균

			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			total = korTotal+ engTotal+mathTotal;
			
			System.out.printf("%3d", i + 1);

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%8d", score[i][j]);
			}

			avg = sum / (float) score[i].length; // 평균계산
			System.out.printf("%8d %8.1f%n", sum, avg);
		}

		System.out.println("=============================");
		System.out.printf("총점:%5d %6d %6d %6d %8.1f%n", 
				korTotal, engTotal, mathTotal,total,total/3.0);
	}
}
