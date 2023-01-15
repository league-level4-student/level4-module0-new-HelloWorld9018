package _04_Snake;

public class Location {
int x;
int y;

	public Location(int x, int y) {
	// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public boolean equals(int x, int y) {
		boolean matching = false;
		if(this.x == x & this.y == y) {
			matching  = true;
		}
		return matching;
	}

	public boolean equals(Location l) {
		boolean matching = false;
		if(this.x == l.getX() & this.y == l.getY()) {
			matching  = true;
		}
		return matching;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}
	public int getY() {
		return y;
	}
}

