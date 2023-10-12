
public class Merge_sort {
	
	
	void merge_sort_twoParts(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            merge_sort_twoParts(arr, l, m); 
            merge_sort_twoParts(arr , m+1, r); 	
  
            // Merge the sorted halves 
            mergeTwoParts(arr, l, m, r); 
        } 
    }
	void mergeTwoParts(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; //Left part
        int n2 = r - m; //Right part
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) //Fills the left part
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) //Fills the right part
            R[j] = arr[m + 1+ j]; 
  
  
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) //Arranges the array from smaller
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) //Fills the remaining elements
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) //Fills the remaining elements
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
	
	public void merge_sort_threeParts(int arr[], int l, int r) {
		if((r - l) > 1) {
			// Find the parts to be splitted
			int first = l + (r-l+1)/3;
			int second = first + (r-l+1)/3;
			
			// Sort first, second  and third halves 
			merge_sort_threeParts(arr, l, first-1);
			merge_sort_threeParts(arr, first, second-1);
			merge_sort_threeParts(arr, second, r);
			
			// Merge the sorted halves 
			mergeThreeParts(arr, l, first, second, r);
		}
		else if((r-l)==1) {//Sorts if splitted part is consist of two elements
			mergeThreeParts(arr, l, l, l+1, r);
		}

	}
	 void mergeThreeParts(int arr[], int l, int first, int second, int r){
		int n1 = first - l;//Left part
		int n2 = second - first;//Middle part
		int n3 = r - second + 1;//Right part
		
		int L[] = new int[n1];
		int M[] = new int[n2];
		int R[] = new int[n3];
		
		for(int i = 0; i < n1; i++)//Fills the left part
			L[i] = arr[l+i];
		for(int j = 0; j < n2; j++)//Fills the middle part
			M[j] = arr[first + j];
		for(int k = 0; k < n3; k++)//Fills the right part
			R[k] = arr[second + k];
		
		int i = 0, j = 0, k = 0;
		int index = l;
		
		while(i<n1 && j<n2 && k<n3) {//Find the smallest
			if(L[i] <= M[j]) {
				if(L[i] <= R[k]) {
					arr[index] = L[i];
					i++;
				}
				else {
					arr[index] = R[k];
					k++;
				}	
			}
			else
				if(M[j] <= R[k]) {
					arr[index] = M[j];
					j++;
				}
				else {
					arr[index] = R[k];
					k++;
				}
			index++;
		}
		while((i < n1 && j < n2) || (i < n1 && k < n3) || (j < n2 && k < n3)) {//Finds the smaller between remaining arrays
			if(i >= n1) {
				if(M[j] <= R[k]) {
					arr[index] = M[j];
					j++;
				}
				else {
					arr[index] = R[k];
					k++;
				}
			}
			else if(j >= n2) {
				if(L[i] <= R[k]) {
					arr[index] = L[i];
					i++;
				}
				else {
					arr[index] = R[k];
					k++;
				}
			}
			else {
				if(L[i] <= M[j]) {
					arr[index] = L[i];
					i++;
				}
				else {
					arr[index] = M[j];
					j++;
				}
			}
			index++;
		}
			while(i < n1) {//Fills the remaining elements
				arr[index] = L[i];
				i++;
				index++;
			}
			while(j < n2) {//Fills the remaining elements
				arr[index] = M[j];
				j++;
				index++;
			}
			while(k < n3) {//Fills the remaining elements
				arr[index] = R[k];
				k++;
				index++;
			}
			
		
	}
	

}

