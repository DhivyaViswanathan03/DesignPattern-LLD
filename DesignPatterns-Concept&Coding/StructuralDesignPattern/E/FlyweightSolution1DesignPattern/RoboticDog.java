package E.FlyweightSolution1DesignPattern;

public class RoboticDog implements IRobot {
	
	String type;
	Sprites sprites;
	
	public RoboticDog(String type,Sprites sprites) {
		this.type=type;
		this.sprites=sprites;
	}

	public String getType() {
		return type;
	}

	public Sprites getSprites() {
		return sprites;
	}

	@Override
	public void display(int x, int y) {
		System.out.println("RoboticDog.display(): "+x+" "+y);

	}

}
