package _02_Integer_Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntegerStack {
	//1. create a private array of integers
	int[]i;
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	public IntegerStack() {
		i=new int[0];
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		//A. create a new array that is one element larger than the member array
		int []j;
				j = new int[i.length+1];
		//B. set the last element of the new array equal to the integer passed into the method
		j[j.length-1]=v;
		//C. iterate through the member array and copy all the elements into the new array
		for (int k = 0; k < i.length; k++) {
			j[k] = i[k];
		}
		//D. set the member array equal to the new array.
		i=j;
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		int b=i[i.length-1];
		//B. create a new array that is one element smaller than the member array
		int[]l;
		l=new int[b-1];
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		for (int m = 0; m < l.length; m++) {
			l[m]=i[m];
		}
		//D. set the member array equal to the new array
		i=l;
		//E. return the variable you created in step A
		return b;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		int []n;
		n = new int [0];
		i=n;
	}
	
	//6. Complete the size array to return 
	//   the length of the member array
	public int size() {
		return 0;
	}
}
