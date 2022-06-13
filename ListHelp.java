import java.util.*;


public class ListHelp{
	ArrayList<TestList> initialArray = new ArrayList<TestList>();
	
	void addElem(double x_value, double y_value, int time){
		
		initialArray.add(new TestList(x_value, y_value, time));
	}
	


	public static void main(String[] args){
		
		/* PRINTS + IO ??

		++ Gesamtstrecke zurueckgelegt
		++ Durchschnittsgeschwindigkeit pro Stunde
		++ Kartenskalierung ist 1 = 0,1km
		
		*/
		ArrayList<TestList> testArray = new ArrayList<TestList>();
		
		testArray.add(new TestList(2.3,3.4,15));
		testArray.add(new TestList(3.4,3.5,12));
		testArray.add(new TestList(122.3,3.6,123));
		
		for(int i = 0; i < testArray.size(); i++){
			
			TestList test = testArray.get(i);
			
			System.out.println(test.x_value + " " + test.y_value + " " + test.time);
			
		}
		
		
	} 
	
	
	
	
	
	
}


