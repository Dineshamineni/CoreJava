
public class Fibanocci {

	public static void main(String[] args) {
	
		int a =0;
		int b =1;
		int c;
		int length = 10;
		//System.out.println(a+" "+b);
		for(int i=0; i<length;i++){
			c = a+b;
			System.out.println(" "+ c);
			a=b;
			b=c;
		}
	}
}
