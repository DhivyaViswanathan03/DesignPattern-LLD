package G.MementoDesignPattern;

public class Configurationoriginator {
	
	int height;
	
	int weight;
	
	public Configurationoriginator(int height,int weight) {
		this.height=height;
		this.weight=weight;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public ConfigurationMemento createMemento() {
		return new ConfigurationMemento(this.height, this.weight);
	}
	
	public void restoreMemento(ConfigurationMemento memento) {
		this.height=memento.height;
		this.weight=memento.weight;
		
		
	}

	
	
	

}
