package myproject;

public class If_else_home_work {

	public static void main(String[] args) {
		int s1 = 10;
		int s2 = 9;
		int ex = 10;
		
		float gm = ( s1 + s2 ) * 0.2f + ex * 0.6f;
		
		if( s1 > 1 && s1 <= 10 && s2 > 1 && s2 <= 10 && ex > 1 && ex <= 10) {
			
			System.out.println( " Semester 1 " + s1 );
			System.out.println( " Semester 2 " + s2 );
			System.out.println( " Exam " + ex );
			System.out.println( " GENERAL MARK " + gm );
			
	    if( gm >= 1.0 && gm < 4.9 ) {
		    System.out.println( " Very bad !" );
		} else if( gm >= 5.0 && gm < 6.9) {
			System.out.println( " Bad !" );
		} else if(gm >= 7.0 && gm < 8.9) {
			System.out.println( " Good !" );
        } else if( gm >= 9.0 && gm <= 10.0) {
        	System.out.println( " Very Good !" );
        } 
	    
		} else {
			System.out.println( " Wrong value!! " );
		}
    }
}