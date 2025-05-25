package week1.day1;

public class LearnJavaOperators {
	public static void main(String[] args) {
	//Assignment operator
		int a = 22;
		String name = "Keep Learning";
	
	//Arthimetic operator +-*/
		int b = 11;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
		//Comparison operator - Comparing two values
	//Comparison is correct -> True
	//Comparison is incorrect -> False
		int c = 4;
		int d = 5;
		int e = 5;
	//equalTo
		System.out.println(c == d);
	//lessThan
		System.out.println(c<d);
	//greaterThan
		System.out.println(c>d);
	//lessOrEqualTo
		System.out.println(d<=e);
	//greaterThanOrEqualTo
		System.out.println(c>=d);
	//notEqualTo
		System.out.println(d!=e);
		
	//Logical operators And and Or
	int s = 7;
	int t = 8;
	System.out.println(s==t && s<t);
	System.out.println(s==t || s<t);
	
	//Increment and Decrement operator
		//post increment - increase the value by 1(m++)
		int m = 7;
		System.out.println(m++);
		System.out.println(m);
		//pre increment - increase the value by 1(++m)
		System.out.println(++m);
		
		//post decrement - increase the value by 1(m--)
		System.out.println(m--);
		System.out.println(m);
		
		//pre increment - increase the value by 1(++m)
				System.out.println(--m);
				System.out.println(m);
	}

	
	
}
