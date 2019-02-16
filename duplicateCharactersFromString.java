//Print duplicate characters from String
public class duplicateCharactersFromString {

	public static void main(String[] args) {

		String str = "aabccddeef";

		String temp[] = str.split("");
		
		System.out.print("Duplicate characters are: ");
		for (int i = 0; i < temp.length; i++) {
			
			for (int j = i + 1; j < temp.length; j++) { // loop will start from j=1+1

				if (temp[i].equalsIgnoreCase(temp[j])) {
					
					System.out.print(temp[j]+", ");
					
				}
				
			}

		}

	}

}
