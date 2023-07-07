package Test;

public class MyArray {
	public static void main(String arg[]) {
		char inverse[][]; // make an inverted triangle
		
		char sign[] = new char[3];
		
		sign[0] = 'Y';
		sign[1] = 'J';
		sign[2] = 'W';
		
		inverse = new char[8][];
		for(int i=7; i>=0 ; i--) { // start at the last line of the array to make inverted one
			inverse[i] = new char[i+1];
			for(int j=0; j<=i; j++) {
				inverse[i][j]= '@';
				System.out.print(inverse[i][j]);
			}
			System.out.println();
		}
			
			
		System.out.print((char)sign[0]);
		System.out.print((char)sign[1]);
		System.out.print((char)sign[2]);
	}
}
