import java.util.*;
/**
Seq.java
A utility class that provide methods to compute elements of the
recursive sequence.
*/
public class Seq{
	private static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	/**
	Recursively computes seq(n)
	@param n Non-negative integer.
	@return int Element n in the recursive sequence.
	*/
	public static int seqR(int n){
		System.out.println("seq(" + n + ")");
		if(n==0){
			return 2;
		}
		if(n==1){
			return 3;
		}
		else
		{
			return seqR(n - 1) + seqR(n - 2);
		}
		
	}


	public static int seqM(int i)
	{
		if(arr.size() == 0)
		{
			arr.add(0,2);
			arr.add(1,3);
		}

		if(arr.contains(i)){

			return arr.indexOf(i);

		}
		else
		{
				arr.add(i,seqR(i));
				
		}

		return arr.get(i);
		
	}




	public static int seqI(int n){
		int value = n;
	 	ArrayList<Integer> arrInt = new ArrayList<Integer>();
		int s0 = 2;
		int s1 = 3;
		arrInt.add(0,s0);
		arrInt.add(1,s1);
		if(n == 0){
			return 2;
		}
		if(n == 1){
			return 3;
		}
		int i = 2;
		boolean flag = false;
		for(;n > 1;n--){
			n = n + ((n-1) + (n-2));
			if(flag){
			arr.add(i,n);
			i++;
		}else{
			n=n + s0 + s1;
			flag = true;
			arr.add(i,n);
		}
		}

		return n;
	}


}
