package recursion;

public class APowerB {

	public static void main(String[] args) {
		System.out.println(pow(3,4));
	}
	public static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*pow(a,b-1);
		}
	}
	
