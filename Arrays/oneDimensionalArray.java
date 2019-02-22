package Array;
//Different types of array , 1D, 2D with examples
public class oneDimensionalArray {
/*Java array is an object which contains elements of a similar data type.
Advantage: Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
Random access: We can get any data located at an index position.
Diadvantage: Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.*/	
	
		public static void main(String[] args) {
			
		//One dimensional array
			int [] i = new int [5]; //declaration and instantiation
			
			//initialization
			i[0] = 5;
			i[1] = 4;
			i[2] = 6;
			i[3] = 68;
			i[4] = 6;
			
			for (int a=0; a<i.length; a++) {
				System.out.println(i[a]);
			}
			System.out.println("-------------------------");
			
			char [] c = {'a', 'e', 't', 'y'}; //declaration, instantiation, initialization
			
			//Print the whole array
			for (int j=0; j<c.length; j++) {
				System.out.print(c[j]+ ", ");
			}
			
	}

}
