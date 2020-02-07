public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1= new Movie("Casino Royale","Eon Productions","PG-13");
		
		System.out.println(m1);
		String rater= m1.getPG();
		boolean isPGPresent = rater.indexOf("PG") != -1 ? true : false;
		System.out.println(isPGPresent);
		
		if(isPGPresent){
			System.out.println(m1.getTitle() + " is a PG movie");
			
		}
		
		
			
			
		
	}

}
