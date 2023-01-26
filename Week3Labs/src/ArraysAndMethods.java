
public class ArraysAndMethods {

	public static void greet(String name) {
		System.out.println("Hello, " + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		arr[0]=1;
		arr[1]=5;
		arr[2]=2;
		arr[3]=8;
		arr[4]=13;
		arr[5]=6;
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
		//Out of bounds error for arr[length] & these:
		//System.out.println(arr[6]);
		//System.out.println(arr[-1]);
		
		//traditional for loop
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//enhanced for loop
		for(int num:arr) {
			System.out.println(num);
		}
		
		int sum =0;
		for(int num:arr) {
			sum += num;
		}
		
		int average = sum/arr.length;
		
		
		//prints odd numbers
		for(int num:arr) {
			if(num%2==1)
				System.out.println(num);
		}
		
		String[] arr2 = {"Sam","Sally","Thomas","Robert"};
		int letterSum =0;
		for(String name:arr2) {
			letterSum += name.length();
		}
		
		greet("John");
		

		
		
		}

}
