package Array;

public class swapFirstLastElementArray {

	public static void main(String[] args) {
		
		int i[] = {11, 12, 13, 14, 15, 16, 17};
		
		/*System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[i.length-1]);*/
		
		for (int a = 0; a<i.length; a++) {
			System.out.print(i[a]+" ");
		}
		
		System.out.println();
		int temp;		
		temp = i[0];
		i[0] = i[i.length-1];
		i[i.length-1] = temp;
		
		/*System.out.println(i[0]);
		System.out.println(i[i.length-1]);*/
		
		for (int a = 0; a<i.length; a++) {
			System.out.print(i[a]+" ");
		}
		
	}

}
