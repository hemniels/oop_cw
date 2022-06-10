/* Programm enthält keine print Statement enstprechend der Aufgabenstellung.
Letzte for-schleife durchläuft ein sortiertes Array und erhöht eine counter Variable.
Jedoch ist mir keine Schleifen-Logik eingefallen, um mit einem print Statement jede Zahl nur einmal auszugeben.
Jedes getestete Print Statement gab dann bspw. 5x die gleiche Zahl aus, statt wie gefordert nur einmal.
Bitte um Verbersserungsvorschlag. Ferner wurde hier java.util benutzt,
Um auf der Kommandozeile das sortierte Array auszugeben, sonst fuer keine anderen Funktionen */

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