package amitproject;

public class FabbnociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=20;
	int d;
	int i;
	System.out.println("The Fibannoci Series are:");
	System.out.print(a+ " "+b);
	for(i=2;i<c;++i) {
		d=a+b;
		
		System.out.print(" "+d);
		a=b;
		b=d;
	}
	}

}
