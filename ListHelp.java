import java.util.*;


public class ListHelp{
	
	int n = 12;
	
			void addValue(int zx, String xx, int xz){
			ArrayList<TestList> test = new ArrayList<>();
			
			for (int i = 0; i < n; i++){
				test.add(new TestList(zx,xx,xz));
			}
			
			printValue(test);
		}
		
		void printValue(ArrayList<TestList> list){
			for (int i = 0; i < n; i++){
				TestList test = list.get(i);
				
				System.out.println(test.zx + " " + test.zz + " " + test.xz);
			}
		}
		
	public static void main(String[] args){
		
		/* BUGGY MAIN METHOD MAYBE ADDVALUE FUNKTION
		int zx = 10;
		String zz = "Subhuman";
		int xz = 150;
		
		TestList test = new TestList();
		
		test.addValue(zx,zz,xz);
		*/
		
		
	} 
	
	
	
	
	
	
}


