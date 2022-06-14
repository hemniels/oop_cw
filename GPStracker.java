import java.util.*;


public class GPStracker{
	
	
	void IOWaypoint(ArrayList<WayPoint> list, double xpos, double ypos, int timestamp){

			System.out.println("Geben Sie einen Wegpunkt(Xpos/Ypos/Timestamp) ein");
			
			System.out.println("ENTER XPOS");
			xpos = In.readDouble();
			
			System.out.println("ENTER YPOS");
			ypos = In.readDouble();
			
			System.out.println("ENTER TIMESTAMP");
			timestamp = In.readInt();
			
			list.add(new WayPoint(xpos,ypos,timestamp));
	}
	
	


	public static void main(String[] args){
		double DEFAULT_XPOS = 0;
		double DEFAULT_YPOS = 0;
		int DEFAULT_TIMESTAMP = 0;
		int DEFAULT_SIZE = 0;
		int USER_SIZE = 0;
		
		int FULL_DISTANCE = 0;
		double AVERAGE_SPEED = 0;
		
		ArrayList<WayPoint> DEFAULT_ARRAY = new ArrayList<WayPoint>();
		

		
		
		GPStracker GPStracker = new GPStracker();
		
		System.out.println("Anzahl der Wegpunkte eingeben: ");
		USER_SIZE = In.readInt();

		while(DEFAULT_SIZE < USER_SIZE){
			GPStracker.IOWaypoint(DEFAULT_ARRAY, DEFAULT_XPOS, DEFAULT_YPOS, DEFAULT_TIMESTAMP);
			
			DEFAULT_SIZE++;
		}
		
		
		for(int i = 0; i < DEFAULT_ARRAY.size(); i++){
			
			WayPoint test = DEFAULT_ARRAY.get(i);
			
			System.out.println(test.x_value + " " + test.y_value + " " + test.time);
			
		}
	}
}


