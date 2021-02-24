package Factory;

import ConcreateProduct.Door;
import ConcreateProduct.Maze;
import ConcreateProduct.Room;
import ConcreateProduct.Wall;

public class MazeFactory {
	public MazeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Maze makeMaze(){
		return new Maze();
	}
	
	public Wall makeWall(){
		return new Wall();
	}
	
	public Room makeRoom(int n){
		return new Room(n);
	}
	
	public Door makeDoor(Room r1, Room r2){
		return new Door(r1, r2);
	}
	
	
	Maze aMaze = new Maze();
	Room r1 = new Room(1);
	Room r2 = new Room(2);
	Door theDoor = new Door(r1, r2);
	
}
