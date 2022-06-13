import java.util.*;


public class ListHelp{
	
	void addElem(ArrayList<TestList> list, double x_value, double y_value, int time){
			
			list.add(new TestList(x_value, y_value, time));
			
	}
	
	
	void IOWaypoint(double xpos, double ypos, int timestamp){

			System.out.println("Geben Sie einen Wegpunkt(Xpos/Ypos/Timestamp) ein");
			
			System.out.println("ENTER XPOS");
			xpos = In.readDouble();
			
			System.out.println("ENTER YPOS");
			ypos = In.readDouble();
			
			System.out.println("ENTER TIMESTAMP");
			timestamp = In.readInt();
			
			System.out.println(xpos + " " + ypos + " " + timestamp);
			System.out.println(xpos);
			System.out.println(ypos);
			System.out.println(timestamp);
	}
	
	


	public static void main(String[] args){
		
		double DEFAULT_XPOS = 0;
		double DEFAULT_YPOS = 0;
		int DEFAULT_TIMESTAMP = 0;
				
		/* PRINTS + IO ??

		++ Gesamtstrecke zurueckgelegt
		++ Durchschnittsgeschwindigkeit pro Stunde
		++ Kartenskalierung ist 1 = 0,1km
		
		*/
		
		
		ArrayList<TestList> testArray = new ArrayList<TestList>();
		ListHelp ListHelp = new ListHelp();
		
		ListHelp.IOWaypoint(DEFAULT_XPOS, DEFAULT_YPOS, DEFAULT_TIMESTAMP);
		
		
		
		for(int i = 0; i < testArray.size(); i++){
			
			TestList test = testArray.get(i);
			
			System.out.println(test.x_value + " " + test.y_value + " " + test.time);
			
		}
		
		
	}
	
}


