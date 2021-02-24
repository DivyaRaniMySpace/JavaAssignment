package ConcreateProduct;

public class Door extends MapSite{

	@Override
	public void Enter() {
		// TODO Auto-generated method stub
		
	}

	private Room room1;
	private Room room2;
	boolean isOpen;
	
	public Door(Room room1, Room room2) {
		
	}
	
	public Door() {
		// TODO Auto-generated constructor stub
	}

	public Room otherSideRoom(Room room1) {
		return room1;}
	
}
