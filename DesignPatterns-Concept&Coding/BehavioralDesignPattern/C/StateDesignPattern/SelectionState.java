package C.StateDesignPattern;

import java.util.List;

public class SelectionState implements IState {
	public SelectionState() {
		System.out.println("Currently Vending machine is in SelectionState");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		System.out.println("clickOnInsertCoinButton...from SelectionState");
		throw new Exception("you can not click on insert coin button in Selection state");
	}

	@Override
	public void insertCoin(VendingMachine machine, CoinEnum coin) throws Exception {
		throw new Exception("you can not  insert coin in Selection state");
	}

	@Override
	public void clickOnProductSelectionButton(VendingMachine machine) {
		return;
	}

	@Override
	public void chooseProduct(VendingMachine machine, int code) throws Exception {
		// 1. get item of this codeNumber
		Item item = machine.getInventory().getItem(code);

		// 2. total amount paid by User
		int paidByUser = 0;
		for (CoinEnum coin : machine.getCoinList()) {
			paidByUser = paidByUser + coin.value;
		}
		// 3. compare product price and amount paid by user
		if (paidByUser < item.getPrice()) {
			System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice()
					+ " and you paid: " + paidByUser);
			  refundFullMoney(machine);
			  throw new Exception("insufficient amount");
		}  else if(paidByUser >= item.getPrice()) {
			if(paidByUser>item.getPrice()) {
				getChange(paidByUser-item.getPrice());
			}
			 machine.setVendingMachineState(new DispenseState(machine,code));
		}

	}

	@Override
	public int getChange(int returnExtraMoney) {
		System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
		return returnExtraMoney;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine) throws Exception {
		throw new Exception("product can not be dispensed Selection state");
	}

	@Override
	public List<CoinEnum> refundFullMoney(VendingMachine machine) {
		 System.out.println("Returned the full amount back in the Coin Dispense Tray");
		 machine.setVendingMachineState(new IdleState());
		 return machine.getCoinList();
	}

}
