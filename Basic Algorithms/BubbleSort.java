class BubbleSort{
	public static void main(String [] aka){
	int[] i= {23,43,21,12,45,99,65,43,6,0};
	bubbleSort(i);
	}
	public static void bubbleSort(int[] arr){
		boolean swapping = false;
		do {
			swapping=false;
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i]>arr[i+1]) {
					swap(arr,i, i+1);
					swapping=true;
				}
			}
		} while (swapping == true);
		System.out.println(Arrays.toString(arr));
	}
	public static void swap (int[] swapArr, int i, int j) {
		 int t = swapArr[i];
		  swapArr[i] = swapArr[j];
		  swapArr[j] = t;
		}
}