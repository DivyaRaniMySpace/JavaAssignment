package ConcreateProduct;

public class Room extends MapSite{
	private int roomNo;
	private MapSite sides;
	public Room(int roomNo){
		
	}
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Enter() {
		// TODO Auto-generated method stub
		
	}

	public MapSite getSides(Direction direction) {
		return sides;
	}

	public void setSides(Direction direction, MapSite sides) {
		this.sides = sides;
	}

}
