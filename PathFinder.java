interface PathFinder {

   // Search for a path between the given start and end tile in the maze
   // and return the path as a sequence of steps (compass directions) to take.
   // Returns null, if there is no path connecting the two tiles.
   Iterable<Maze.Direction> findPath (Maze maze,
                                      int startRow, int startColumn,
                                      int endRow, int endColumn);
}
