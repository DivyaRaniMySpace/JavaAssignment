package main;

import ConcreateProduct.Direction;
import ConcreateProduct.Door;
import ConcreateProduct.Maze;
import ConcreateProduct.Room;
import Factory.MazeFactory;

public class MazeGame {
	Maze createMaze(MazeFactory mazefactory){

		System.out.println("Entered");
		Maze amaze = mazefactory.makeMaze();

		System.out.println("Room1");
		Room room1 = mazefactory.makeRoom(1);
		
		System.out.println("Room2");
		Room room2 = mazefactory.makeRoom(2);
		
		System.out.println("Door");
		Door door = mazefactory.makeDoor(room1, room2);
		
		System.out.println("Add room1");
		amaze.addRoom(room1);

		System.out.println("Add room2");
		amaze.addRoom(room2);
		
		System.out.println("Add sides to room1");
		room1.setSides(Direction.NORTH, mazefactory.makeWall());
		room1.setSides(Direction.EAST, door);
		room1.setSides(Direction.SOUTH, mazefactory.makeWall());
		room1.setSides(Direction.WEST, mazefactory.makeWall());
		
		System.out.println("Add sides to room2");
		room2.setSides(Direction.NORTH, mazefactory.makeWall());
		room2.setSides(Direction.EAST, mazefactory.makeWall());
		room2.setSides(Direction.SOUTH, mazefactory.makeWall());
		room2.setSides(Direction.WEST, door);
		return amaze;
	}
	
	public static void main(String args[]) {
		System.out.println("Started");
		MazeGame game = new MazeGame();
		MazeFactory factory = new MazeFactory();
		game.createMaze(factory);

		System.out.println("End");
	}
}
