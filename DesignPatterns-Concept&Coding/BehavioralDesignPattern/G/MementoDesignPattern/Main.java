package G.MementoDesignPattern;

public class Main {

	public static void main(String[] args) {

		ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

		Configurationoriginator originator = new Configurationoriginator(3, 10);

		ConfigurationMemento memento = originator.createMemento();

		careTaker.addMemento(memento);

		originator.setHeight(4);
		originator.setWeight(11);

		memento = originator.createMemento();

		careTaker.addMemento(memento);

		originator.setHeight(5);
		originator.setWeight(12);

		memento = originator.createMemento();

		careTaker.addMemento(memento);
		
		originator.setHeight(6);
		originator.setWeight(13);

		ConfigurationMemento restoredLastMemento = careTaker.undo();
		originator.restoreMemento(restoredLastMemento);
		System.out.println(originator.height + " " + originator.weight);

	}

}
