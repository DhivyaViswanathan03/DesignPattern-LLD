package C.StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
	
	IState VendingMachineState;
	Inventory inventory;
	List<CoinEnum> coinList;
	
	VendingMachine(){
		VendingMachineState=new IdleState();
		inventory=new Inventory(10);
		coinList=new ArrayList<CoinEnum>();
	}
	
	
	public IState getVendingMachineState() {
		return VendingMachineState;
	}

	public void setVendingMachineState(IState vendingMachineState) {
		VendingMachineState = vendingMachineState;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<CoinEnum> getCoinList() {
		return coinList;
	}

	public void setCoinList(List<CoinEnum> coinList) {
		this.coinList = coinList;
	}



}
