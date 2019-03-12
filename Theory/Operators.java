package Theory;
//https://www.javatpoint.com/operators-in-java
public class Operators {

	public static void main(String[] args) {
		
		//Java Assignment Operators
		int x = 10;
		
		System.out.println(x); //10
		System.out.println(x += 5); //x=x+5 --> x=10+5 --->15
		System.out.println(x -= 5); //x=x-5 --> x=15-5 --->10
		System.out.println(x *= 5); //x=x*5--> x=10*5 --->50
		System.out.println(x /= 5); //x=x/5--> x=50/5 --->10
		System.out.println(x %= 5); //x=x%5--> x=10%5 --->0
		
		System.out.println("------------------");
		x=7;	
		
		System.out.println("x = "+ x);		
		System.out.println(x &= 5);	//5
		
		System.out.println("x = "+ x);
		System.out.println(x |= 4);	//5
		
		System.out.println("x = "+ x);
		System.out.println(x ^= 3);	//6
		
		System.out.println("x = "+ x);
		System.out.println(x >>= 4);//0
		
		System.out.println("x = "+ x);
		System.out.println(x <<= 4);//0
		System.out.println("x = "+ x);
		
		System.out.println("----------Java Logical Operators-----------");
		//Java Logical Operators: Logical operators are used to determine the logic between variables or values
		x = 5;
		
		System.out.println("x = "+ x);
		
		System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
		System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
		System.out.println(x > 3 && x < 10); // returns true because both the conditions are true (5 is greater than 3 AND 5 is less than 10)
		
		System.out.println("-----------------");
		
		x=10; int y =-10;
		
		System.out.println(~x); //-11 (minus of total positive value which starts from 0)  
		System.out.println(~y); //9 (positive of total minus, positive starts from 0)
		
		
		System.out.println("-------------Java Left Shift Operator Example---------------");
		
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		System.out.println("-------------Java Right Shift Operator Example---------------");
		
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		
		System.out.println("-------------Java AND Operator Example: Logical && vs Bitwise &---------------");
//The logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true.
//The bitwise & operator always checks both conditions whether first condition is true or false.
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b && a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b & a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked
		
		
		System.out.println("-------------Java OR Operator Example: Logical || and Bitwise |---------------");
//The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.
//The bitwise | operator always checks both conditions whether first condition is true or false.	
		a=10;  
		b=5;  
		c=20;
		
		System.out.println(a>b || a<c);//true || true = true  
		System.out.println(a>b | a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b || a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b | a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  	
		
		System.out.println("-------------Java Ternary Operator---------------");
//Java Ternary operator is used as one liner replacement for if-then-else statement and used a lot in java programming. it is the only conditional operator which takes three operands.	
		a=2;  
		b=5;
		
		int min=(a<b)?a:b;  
		System.out.println("minumum = "+min);  
		
		System.out.println("---------");
		
		a=10;  
		b=5;
		
		min=(a<b)?a:b;  
		System.out.println("minumum = "+min);  
		
		System.out.println("-----------Adding short and Byte-------------");
		
		short s1=10;  
		short s2=10;
		
		byte b1 = 10;
		byte b2 = 10;

		//a+=b;//a=a+b internally so fine  
		//s1=s1+s2;// will get Compile time error (because 10+10=20 now int) as we can not perform addition or subtraction on short & byte data type.  
		// for performing the addition or subtraction for short or byte data types, we have to do casting.
		
		s1=(short)(s1+s2);//20 which is int now converted to short
		System.out.println(s1); 
		
		//b1 = b1+b2; //cannot add two byte numbers
		
		b1 = (byte) (b1+b2); //after casting, it is possible to add
		
		
		long l1=10; double d1 =10; float f1=1.5f; //if will not add 'f' then will get the compile time error
		long l2=10; double d2 = 10; float f2=1.5f;
		
		l1=l1+l2;
		System.out.println(l1);
		
		d1=d1+d2;
		System.out.println(d1);
		
		f1 = f1+f2;
		System.out.println(f1);
		
		char c1='a'; char c2='b';
		
		char c3=(char) (c1+c2);
		System.out.println(c3);
		
	}

}
