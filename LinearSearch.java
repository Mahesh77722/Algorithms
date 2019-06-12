public class LinearSearch{
	public static void main(String [] arg){
	int [] arr={3,4,6,7,5,8,2,9,1,0};
	Search(arr,9);
	}
	public static void Search(int [] arr,int f) {
		int len=arr.length;
		for (int i = 0; i < len; i++) {
			if(arr[i]==f) {
				System.out.printf("Master, I Find the %d on the index of %d in array.",f,i);
				return;//It will end the program
			}
		}
		System.out.println("There is no such number in array");
		return;
	}
}