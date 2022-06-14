//FINAL VERSION

import java.util.*;


public class GPStracker{
	
	
	void IOWaypoint(ArrayList<WayPoint> list, double xpos, double ypos, int timestamp){

			System.out.println("ENTER A WAYPOINT OF YOUR ROUTE(Xpos/Ypos/Timestamp)");
			
			System.out.println("ENTER XPOS");
			xpos = In.readDouble();
			
			System.out.println("ENTER YPOS");
			ypos = In.readDouble();
			
			System.out.println("ENTER TIMESTAMP");
			timestamp = In.readInt();
			
			list.add(new WayPoint(xpos,ypos,timestamp));
	}
	
	
	double TotalDistance(ArrayList<WayPoint> list, int size){
			double distance = 0;
			
			for(int i = 0; i < size; i++){
				distance = list.get(i).x_value+distance;
			}
			return distance;
	}
	
	double AverageSpeed(ArrayList<WayPoint> list, int size){
			double distance = 0;
			double avg = 0;
			int t = 0;
			
			for(int i = 0; i < size; i++){
				distance = list.get(i).x_value+distance;
				return distance;
			}
			for (int j = 0; j < size; j++){
				t = list.get(j).time / 3600;
				return t;
			}
			
			avg = (double) distance / t;
			return avg;
			
	}
	


	public static void main(String[] args){
		
		double DEFAULT_XPOS = 0;
		double DEFAULT_YPOS = 0;
		int DEFAULT_TIMESTAMP = 0;
		
		int DEFAULT_SIZE = 0;
		int USER_SIZE = 0;
		
		double TOTAL_DISTANCE = 0;
		double AVERAGE_SPEED = 0;
		
		ArrayList<WayPoint> DEFAULT_ARRAY = new ArrayList<WayPoint>();
		GPStracker GPStracker = new GPStracker();
		
		
		System.out.println("ENTER AMOUNT OF ROUTE'S WAYPOINTS: ");
		USER_SIZE = In.readInt();
		System.out.println("-----------------------------------");


		while(DEFAULT_SIZE < USER_SIZE){
			GPStracker.IOWaypoint(DEFAULT_ARRAY, DEFAULT_XPOS, DEFAULT_YPOS, DEFAULT_TIMESTAMP);
			
			DEFAULT_SIZE++;
		}
		
		System.out.println("------------------------------------------");
		System.out.println("YOUR ROUTE CONTAINS FOLLOWING WAYPOINTS : ");
		System.out.println("#" + " " + " " + "|" + " " + "xpos" + " " + "ypos" + " " + "timestamp");
		for(int i = 0; i < DEFAULT_ARRAY.size(); i++){
			
			WayPoint test = DEFAULT_ARRAY.get(i);
			
			System.out.println(i+1 + "." + " " + "|" + " " + test.x_value + " " + test.y_value + " " + test.time);
			
		}
		
	 
		TOTAL_DISTANCE = GPStracker.TotalDistance(DEFAULT_ARRAY, USER_SIZE) / 10;
		AVERAGE_SPEED = GPStracker.AverageSpeed(DEFAULT_ARRAY, USER_SIZE);
		
		
		System.out.println("------------------------------------------");
		System.out.println("YOUR ROUTE HAS A TOTAL DISTANCE OF : " + TOTAL_DISTANCE + "km");
		
		System.out.println("YOUR AVERAGE SPEED (KM/H) WAS : " + AVERAGE_SPEED);
	}
}


