package basics_exmble;

public class GCDNumber {
	public static void main(String[] args) {
		int x=10,y=8,gcd=1;
		for(int i=1;i<=x && y<=12;i++) {
			if(x%i==0 &&y%i==0) {
			gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
