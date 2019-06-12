public class SelectionSort{
	public static void main(String []art){
	int i={23,43,21,12,45,99,65,43,6,0};
	SelectionSort(i);
	}
	public static void SelectionSort(int[] arr) {
		
		for (int i = 0;  i< arr.length-1; i++) {
			
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int tem=arr[i];
			arr[i]=arr[min];
			arr[min]=tem;
		}
		System.out.print(Arrays.toString(arr));
	}
}