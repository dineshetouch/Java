package patternAndPyramid;

public class pyramidUsingStar {

	public static void main(String[] args) {
		
		pyramidStar(7);
		
	}
	public static void pyramidStar(int row){
		
		for (int i=0; i<row; i++){
			for (int j=row-1; j>i; j--){
				System.out.print(" "); //print the space
			}
			//star is printed like 1,3,5,7,9,...
			//Formula: 2*i+1
			for(int k=0; k<2*i+1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
