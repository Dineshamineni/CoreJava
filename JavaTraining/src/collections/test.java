package collections;

public class test {

	public static void main(String[] args) {
		
			      int arr[] = {2,3,3,4,4,5,6,1};
			      int n = arr.length;
			      int i, j;
			      System.out.print("The array is: ");
			      for (i = 0; i < n; ++i)
			      System.out.print(arr[i] + " ");
			      System.out.print("\nThe distinct elements of above array are: ");
			      for (i = 0; i < n; i++) {
			         for (j = 0; j < i; j++)
			         if (arr[i] == arr[j])
			            break;
			         if (i == j)
			         System.out.print( arr[i] + " ");
			      }
			   }
			

	}for(i=0; i<n;i++){
		
		//System.out.println(num[i]);
		for(j=0;j<i;j++){
			if(num[i]==num[j])
				break;
			if(i==j){
				System.out.println(num[i]);


