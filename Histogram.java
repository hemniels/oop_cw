/* main method needs rework */

import java.util.*;

class Histogram {
	
	
    public static void main(String[] args){

			int[] userInputA,userInputB;
			int[] sortedArray;
			userInputA = new int[15];
			userInputB = new int[15];
			sortedArray = new int[30];
			
			
			Out.println("Geben Sie 15 Zahlen ein : ");
			for (int i = 0; i < userInputA.length ; i++){
				userInputA[i] = In.readInt(); 
			}
			
			Out.println("Geben Sie weitere 15 Zahlen ein : ");
			for (int i = 0; i < userInputB.length ; i++){
				userInputB[i] = In.readInt(); 
			}
			
			for (int i = 0, j = 0; i < userInputA.length && i < userInputB.length; i++){
				sortedArray[j++] = userInputA[i];
				sortedArray[j++] = userInputB[i];
			}
			
			for (int i = 0 ; i < sortedArray.length; i++){
				for (int j = i+1 ; j < sortedArray.length ; j++){
					if(sortedArray[i] > sortedArray[j]){
						int k = sortedArray[i];
						sortedArray[i] = sortedArray[j];
						sortedArray[j] = k;
					}
				}
			}
			
			for (int i = 0; i < sortedArray.length; i++){
				int count = 1;
				for (int j = i+1; j < sortedArray.length; j++){
					if(sortedArray[i] == sortedArray[j]){
						count++;
					}
				}
			}
			
			System.out.println(Arrays.toString(sortedArray));
	}
}