package E.FlyweightSolution1DesignPattern;

public class HumanoidRobot implements IRobot {
	
	String type;
	Sprites sprites;
	
	HumanoidRobot(String type,Sprites sprites){
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
    System.out.println("HumanoidRobot.display():"+x+" "+y);
	}

}
