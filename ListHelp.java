import java.util.*;


public class ListHelp{
	
	void addElem(ArrayList<TestList> list, double x_value, double y_value, int time){
			
			list.add(new TestList(x_value, y_value, time));
			
	}
	


	public static void main(String[] args){
		
				
		/* PRINTS + IO ??

		++ Gesamtstrecke zurueckgelegt
		++ Durchschnittsgeschwindigkeit pro Stunde
		++ Kartenskalierung ist 1 = 0,1km
		
		*/
		
		
		ArrayList<TestList> testArray = new ArrayList<TestList>();
		ListHelp ListHelp = new ListHelp();
		
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		ListHelp.addElem(testArray, 15.2, 13.2, 15);
		
		
		for(int i = 0; i < testArray.size(); i++){
			
			TestList test = testArray.get(i);
			
			System.out.println(test.x_value + " " + test.y_value + " " + test.time);
			
		}
		
		
	}
	
}


