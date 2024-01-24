package E.CommandDesignPattern;

import java.util.Stack;

public class MyRemoteControl {
	
	Stack<ICommand> stack=new Stack();
	
	ICommand command;
//	public MyRemoteControl(ICommand command) {
//		this.command=command;
//	}
	
	public void setCommand(ICommand command){
		this.command=command;
	}
	
	public void pressButton() {
		command.execute();
		stack.add(command);
	}
	
	public void undo() {
		if(!stack.isEmpty()) {
			ICommand popedElement = stack.pop();
			System.out.println("Pop class is:"+popedElement.getClass().getName());
			popedElement.undo();
		}
	}

}
