package collections;


public class reverse_assign {

	public static void main(String[] args){
		int num[]= {2,3,3,4,4,5,6,1};
		int n=num.length; 
		int i,j;
		int temp;
		int input = 0;
		
		
		 for ( i = 0; i < n - 1; i++) 
	        {
			for(j=i+1;j<n;j++){ 
				if (num[i] > num[j]) 
                {
                    temp = num[i];
                   num[i] = num[j];
                  //  num[j] = temp;
                }
				
			}
	            System.out.print(num[i] + ",");
	           
	        }
	       System.out.print(num[n - 1]);
	       
	      //  input =input + num[n-1];
	     //   System.out.println(input);
		
	        /*
		
		System.out.print("Distinct values are: ");
		for(i=0; i<n;i++){
			
			//System.out.println(num[i]);
			for(j=0;j<i;j++){
				if(num[i]==num[j])
					break;
		}
				if(i==j ){
					
					int distinctval =num[i];
					 System.out.print(distinctval + " ");
				}
						   
		                

			
		}
				//System.out.print(distinctval + " ");
				 
				 */
		
	}
	}


