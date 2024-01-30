package E.FlyweightSolution1DesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
	
	static Map<String,IRobot> cachedMemory=new HashMap<String,IRobot>();
	
	public static IRobot createRobot(String roboType) {
		if(cachedMemory.containsKey(roboType)) {
			return cachedMemory.get(roboType);
		}else {
			if(roboType.equalsIgnoreCase("HUMANOIDROBOT")) {
				Sprites sprites=new Sprites();
				IRobot humanoidRobot=new HumanoidRobot(roboType,sprites);
				cachedMemory.put(roboType, humanoidRobot);
				return cachedMemory.get(roboType);
			}else if(roboType.equalsIgnoreCase("ROBOTICDOG")) {
				Sprites sprites=new Sprites();
				IRobot roboticDog=new HumanoidRobot(roboType,sprites);
				cachedMemory.put(roboType, roboticDog);
				return cachedMemory.get(roboType);
			}
		}
		return null;
		
	}

}
