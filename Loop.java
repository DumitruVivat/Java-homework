package myproject;

public class Loop {

	public static void main(String[] args) {
		
		int width = 9;
		int height = 9;
		
		for (int y = 1; y <= height; y++) {
			
			
			for (int x = 1; x <= width; x++) {
				System.out.print( "* " );
			}
			
			System.out.println();
		}

	}

}
