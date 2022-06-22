import java.util.Random;

public class MazeNavigator {

	static Maze buildMaze (int n, long seed) {
		Maze maze = new Maze(n, n);
		Random rand = new Random(seed);
		maze.connectPerfectly(rand);
		maze.braidSomeDeadEnds(rand);
		return maze;
	}


   static void printMaze (Maze maze) {
      String[] lines = maze.asTileText();
      for (String ln: lines)
         Out.println(ln);
   }


   public static void main (String[] args) {
      int mazeSize;
      do {
         Out.print("Wie groß soll das Labyrinth sein? (5-15) \"Kästchen\": ");
         mazeSize = In.readInt();
      } while (mazeSize < 5 || mazeSize > 15);  // ensure reasonable size of maze
      Out.print("Seed-Wert für die Erzeugung des Labyrinths: ");
      long seed = In.readLong();
      Maze maze = buildMaze(mazeSize, seed);
      printMaze(maze);


      // navigation starts in the upper-left corner of the maze
      int startRow = 1;
      int startColumn = 1;

      // navigation target is located in the lower-right corner of the maze
      int endRow = (2 * maze.rowCount) - 1;
      int endColumn = (2 * maze.colCount) - 1;
/*
      // TODO implement a suitable class RecursivePathFinder
      PathFinder strategy = new RecursivePathFinder();

      Iterable<Maze.Direction> path =
         strategy.findPath(maze, startRow, startColumn, endRow, endColumn);
      if (path == null) {
         Out.print("Es gibt keinen Weg zwischen Start- und Ziel-Feld!");
         return;
      }   
*/
      int stepCounter = 0;
      for (Maze.Direction step: path) {

         Out.print(step);
         Out.print(" ");

         stepCounter++;
      }
      Out.println();
      Out.println("Ziel erreicht! Anzahl Schritte: " + stepCounter);
   }
}
