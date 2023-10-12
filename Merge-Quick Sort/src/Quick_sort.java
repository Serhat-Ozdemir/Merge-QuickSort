
public class Quick_sort {

	public Quick_sort() {
		// TODO Auto-generated constructor stub
	}
	public void quicksortLast(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partitionLast(arr, low, high);
			quicksortLast(arr, low, pi-1);
			quicksortLast(arr, pi+1, high);
		}
		
	}
	
	int partitionLast(int[] arr, int low, int high) {//Places the smaller elements than pivot to the left of the array
		int pivot = arr[high];
		
		int i = low -1;//To place the smaller one at the end
		
		for(int j = low; j <= high - 1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr, i, high);//Swaps the pivot
		return i;
	}
	
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void quicksortFirst(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partitionFirst(arr, low, high);
			quicksortFirst(arr, low, pi-1);
			quicksortFirst(arr, pi+1, high);
		}		
	}
	int partitionFirst(int[] arr, int low, int high) { //Places the bigger elements than pivot to the right of the array
		int pivot = arr[low];
		
		int i = high + 1; //To place the bigger one at the end
		
		for(int j = high; j >= low + 1; j--) { //Checks if bigger than pivot
			if(arr[j] > pivot) {
				i--;
				swap(arr, i, j);
			}
		}
		i--;
		swap(arr, i, low);//Swaps the pivot
		return i;
	}

	public void quicksortRandom(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partitionRandom(arr, low, high);
			quicksortRandom(arr, low, pi-1);
			quicksortRandom(arr, pi+1, high);
		}		
	}
	
	int partitionRandom(int[] arr, int low, int high) { //Places the smaller elements than pivot to the left of the array
		int index = (int) Math.random()*(high + 1) + low;
		int pivot = arr[index];
		
		int i = low -1; //To place the smaller one at the end
		
		for(int j = low; j <= high ; j++) {
			if(j == index) {}
			else if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
				if(i == index)//To not lose the pivot index if an element is places to pivot index
					index = j;
			}
		}
		i++;
		swap(arr, i, index);//Swaps the pivot
		return i;
	}

	public void quicksortMidOfFirstMidLastElement(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partitionMidOfFirstMidLastElement(arr, low, high);
			quicksortLast(arr, low, pi-1);
			quicksortLast(arr, pi+1, high);
		}
		
	}
	int partitionMidOfFirstMidLastElement(int[] arr, int low, int high) {//Places the smaller elements than pivot to the left of the array
		int mid = high - low;
		int index = findMedianIndex(arr, low, mid, high);//Finds middle of mid, firs, last
		
		int pivot = arr[index];
		
		int i = low -1;//To place the smaller one at the end
		
		for(int j = low; j <= high ; j++) {
			if(j == index) {}
			else if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
				if(i == index)//To not lose the pivot index if an element is places to pivot index
					index = j;
			}
		}
		i++;
		swap(arr, i, index);//Swaps the pivot
		return i;
	}
	int findMedianIndex(int[] arr, int i, int j, int k) {//Finds the middle value between three elemenets and returns the index
		if((arr[i] <= arr[j] && arr[i] >= arr[k]) || (arr[i] >= arr[j] && arr[i] <= arr[k]))
			return i;
		else if((arr[j] <= arr[i] && arr[j] >= arr[k]) || (arr[j] >= arr[i] && arr[j] <= arr[k]))
			return j;
		else if((arr[k] <= arr[i] && arr[k] >= arr[j]) || (arr[k] >= arr[i] && arr[k] <= arr[j]))
			return k;
		return -1;

	}
}
