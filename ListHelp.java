import java.util.*;


public class ListHelp{
	
	
	void IOWaypoint(ArrayList<TestList> list, double xpos, double ypos, int timestamp){

			System.out.println("Geben Sie einen Wegpunkt(Xpos/Ypos/Timestamp) ein");
			
			System.out.println("ENTER XPOS");
			xpos = In.readDouble();
			
			System.out.println("ENTER YPOS");
			ypos = In.readDouble();
			
			System.out.println("ENTER TIMESTAMP");
			timestamp = In.readInt();
			
			list.add(new TestList(xpos,ypos,timestamp));
	}
	
	


	public static void main(String[] args){
		
		double DEFAULT_XPOS = 0;
		double DEFAULT_YPOS = 0;
		int DEFAULT_TIMESTAMP = 0;
		int TEST_SIZE = 0;
		
		ArrayList<TestList> DEFAULT_ARRAY = new ArrayList<TestList>();
		

		
		
		ListHelp ListHelp = new ListHelp();

		while( TEST_SIZE < 10){
			ListHelp.IOWaypoint(DEFAULT_ARRAY, DEFAULT_XPOS, DEFAULT_YPOS, DEFAULT_TIMESTAMP);
			
			TEST_SIZE++;
		}
		
		
		
		for(int i = 0; i < DEFAULT_ARRAY.size(); i++){
			
			TestList test = DEFAULT_ARRAY.get(i);
			
			System.out.println(test.x_value + " " + test.y_value + " " + test.time);
			
		}
		
		
		
	}
	
}


