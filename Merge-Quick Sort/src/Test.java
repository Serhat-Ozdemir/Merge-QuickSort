
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Quick_sort quick = new Quick_sort();
		Merge_sort merge = new Merge_sort();		
		////////////////////EQUAL INTEGERS////////////////////
		///////////////1.000//////////////
		equalElements(1000, merge, quick);
		//////////////10.000//////////////
		equalElements(10000, merge, quick);
		//////////////100.000/////////////
		equalElements(100000, merge, quick);
		////////////////////RANDOM INTEGERS////////////////////
		///////////////1.000//////////////
		randomInteger(1000, merge, quick);
		//////////////10.000//////////////
		randomInteger(10000, merge, quick);
		//////////////100.000/////////////
		randomInteger(100000, merge, quick);
		////////////////////INCREASING INTEGERS////////////////////
		///////////////1.000//////////////
		IncreasingInteger(1000, merge, quick);
		//////////////10.000//////////////
		IncreasingInteger(10000, merge, quick);
		//////////////100.000/////////////
		IncreasingInteger(100000, merge, quick);
		////////////////////INCREASING INTEGERS////////////////////
		///////////////1.000//////////////
		DecreasingInteger(1000, merge, quick);
		//////////////10.000//////////////
		DecreasingInteger(10000, merge, quick);
		//////////////100.000/////////////
		DecreasingInteger(100000, merge, quick);
		/*merge.merge_sort_threeParts(arr, 0, arr.length-1);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		quick.quicksortMidOfFirstMidLastElement(arr, 0, arr.length-1);*/

	}
	
	static int[] generateEqual(int size) {
		int[] arr = new int[size];
		int randomNumber = (int) (Math.random()*100 +1);
		for(int i = 0; i < arr.length; i++)
			arr[i] = randomNumber;
		return arr;
	}
	
	static int[] generateRandom(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random()*100 +1);
		return arr;
	}
	
	static int[] generateIncreasing(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i;
		return arr;
	}
	
	static int[] generateDecreasing(int size) {
		int[] arr = new int[size];
		int j = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = j;
			j--;
		}
		return arr;
	}
	
	static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static void equalElements(int size, Merge_sort merge, Quick_sort quick) {
		long startTime, timePassed;
		////Merge Two Parts////
		int[] arr = generateEqual(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_twoParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Equal Elements: " + timePassed);
		////Merge three Parts////
		startTime = System.currentTimeMillis();
		merge.merge_sort_threeParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Equal Elements: " + timePassed);
		////Quick First Element////
		startTime = System.currentTimeMillis();
		quick.quicksortFirst(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Equal Elements: " + timePassed);
		////Quick Random Element////
		startTime = System.currentTimeMillis();
		quick.quicksortRandom(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Equal Elements: " + timePassed);
		////Quick MidfFirstMidLastElement////
		startTime = System.currentTimeMillis();
		quick.quicksortMidOfFirstMidLastElement(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Equal Elements: " + timePassed);
	}

	static void randomInteger(int size, Merge_sort merge, Quick_sort quick) {
		long startTime, timePassed;
		int[] arr;
		////Merge Two Parts////
		arr = generateRandom(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_twoParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Random Elements: " + timePassed);
		////Merge three Parts////
		arr = generateRandom(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_threeParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Random Elements: " + timePassed);
		////Quick First Element////
		arr = generateRandom(size);
		startTime = System.currentTimeMillis();
		quick.quicksortFirst(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Random Elements: " + timePassed);
		////Quick Random Element////
		arr = generateRandom(size);
		startTime = System.currentTimeMillis();
		quick.quicksortRandom(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Random Elements: " + timePassed);
		////Quick MidfFirstMidLastElement////
		arr = generateRandom(size);
		startTime = System.currentTimeMillis();
		quick.quicksortMidOfFirstMidLastElement(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Random Elements: " + timePassed);
	}
	
	static void IncreasingInteger(int size, Merge_sort merge, Quick_sort quick) {
		long startTime, timePassed;
		int[] arr;
		////Merge Two Parts////
		arr = generateIncreasing(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_twoParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Increasing Elements: " + timePassed);
		////Merge three Parts////
		arr = generateIncreasing(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_threeParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Increasing Elements: " + timePassed);
		////Quick First Element////
		arr = generateIncreasing(size);
		startTime = System.currentTimeMillis();
		quick.quicksortFirst(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Increasing Elements: " + timePassed);
		////Quick Random Element////
		arr = generateIncreasing(size);
		startTime = System.currentTimeMillis();
		quick.quicksortRandom(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Increasing Elements: " + timePassed);
		////Quick MidfFirstMidLastElement////
		arr = generateIncreasing(size);
		startTime = System.currentTimeMillis();
		quick.quicksortMidOfFirstMidLastElement(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Increasing Elements: " + timePassed);
	}

	static void DecreasingInteger(int size, Merge_sort merge, Quick_sort quick) {
		long startTime, timePassed;
		int[] arr;
		////Merge Two Parts////
		arr = generateDecreasing(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_twoParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Decreasing Elements: " + timePassed);
		////Merge three Parts////
		arr = generateDecreasing(size);
		startTime = System.currentTimeMillis();
		merge.merge_sort_threeParts(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Decreasing Elements: " + timePassed);
		////Quick First Element////
		arr = generateDecreasing(size);
		startTime = System.currentTimeMillis();
		quick.quicksortFirst(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Decreasing Elements: " + timePassed);
		////Quick Random Element////
		arr = generateDecreasing(size);
		startTime = System.currentTimeMillis();
		quick.quicksortRandom(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Decreasing Elements: " + timePassed);
		////Quick MidfFirstMidLastElement////
		arr = generateDecreasing(size);
		startTime = System.currentTimeMillis();
		quick.quicksortMidOfFirstMidLastElement(arr, 0, arr.length-1);
		timePassed = System.currentTimeMillis() - startTime;
		System.out.println("Size: " + size + " Calculation Time Merge Two Parts, Decreasing Elements: " + timePassed);
	}

}
