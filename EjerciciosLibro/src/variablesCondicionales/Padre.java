package variablesCondicionales;

public class Padre extends Abuela {

	int x;
	int sergio;

	public Padre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Padre(int x, int sergio) {
		super();
		this.x = x;
		this.sergio = sergio;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getsergio() {
		return sergio;
	}

	public void setsergio(int sergio) {
		this.sergio = sergio;
	}
	
	public int metodoX() {
		return x;
	}

}
