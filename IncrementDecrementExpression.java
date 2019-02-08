
public class IncrementDecrementExpression {

	public static void main(String[] args) {
		
		/*i++ and ++i are very similar but not exactly the same. 
		Both increment the number, but ++i increments the number before the current expression is evaluated,
		whereas i++ increments the number after the expression is evaluated.*/
		
		int i=0;
		System.out.println(++i); //at first increment the value before the current expression is evaluated.
		int j=0;
		System.out.println(j++); //Increments the number after the expression is evaluated.
	}

}
