package studio2;

public class Pi {

	public static void main(String[] args) {
		
		double tIn = 0;
		double tThrown = 0;
		
		for(int i = 0; i<=1000; i++) {
			double x = Math.random();
			double y = Math.random();
			
			double distance = Math.sqrt( Math.pow((x-0.5), 2) + Math.pow((y-0.5), 2)  );
			if (distance <= .5) {
				tIn++;
			}
			
			tThrown++;
		}
		
		double pi = (tIn*4)/tThrown;
		
		System.out.println(pi);
	}

}
