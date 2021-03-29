package variablesCondicionales;

public class ClaseHija extends Padre{

	int y;

	public ClaseHija() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClaseHija(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int metodoY() {
		return y;
	}
}
