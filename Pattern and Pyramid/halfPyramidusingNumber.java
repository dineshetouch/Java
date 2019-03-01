package patternAndPyramid;

public class halfPyramidusingNumber {

	public static void main(String[] args) {
		
		halfPyramid(5);
		}

		public static void halfPyramid(int n) {

			for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
}
