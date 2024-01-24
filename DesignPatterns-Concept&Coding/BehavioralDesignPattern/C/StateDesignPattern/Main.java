package C.StateDesignPattern;

public class Main {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		try {
			

			System.out.println("|");
			System.out.println("filling up the inventory");
			System.out.println("|");

			fillUpInventory(vendingMachine);
			displayInventory(vendingMachine);

			System.out.println("|");
			System.out.println("clicking on InsertCoinButton");
			System.out.println("|");

			IState vendingMachineState = vendingMachine.getVendingMachineState();
			vendingMachineState.clickOnInsertCoinButton(vendingMachine);

			vendingMachineState = vendingMachine.getVendingMachineState();
			vendingMachineState.insertCoin(vendingMachine, CoinEnum.NICKLE);
			vendingMachineState.insertCoin(vendingMachine, CoinEnum.QUARTER);

			System.out.println("|");
			System.out.println("clicking on ProductSelectionButton");
			System.out.println("|");

			vendingMachineState.clickOnProductSelectionButton(vendingMachine);

			vendingMachineState = vendingMachine.getVendingMachineState();
			vendingMachineState.chooseProduct(vendingMachine,102);
			
			 displayInventory(vendingMachine);
		} catch (Exception e) {
			 displayInventory(vendingMachine);
		}

	}

	private static void fillUpInventory(VendingMachine vendingMachine) {
		ItemShelf[] slots = vendingMachine.inventory.getInventory();
		for (int i = 0; i < slots.length; i++) {
			Item newItem = new Item();
			if (i >= 0 && i < 3) {
				newItem.setType(ItemTypeEnum.COKE);
				newItem.setPrice(12);
			} else if (i >= 3 && i < 6) {
				newItem.setType(ItemTypeEnum.PEPSI);
				newItem.setPrice(9);
			} else if (i >= 5 && i < 7) {
				newItem.setType(ItemTypeEnum.JUICE);
				newItem.setPrice(13);
			} else if (i >= 7 && i < 10) {
				newItem.setType(ItemTypeEnum.SODA);
				newItem.setPrice(7);
			}
			slots[i].setItem(newItem);
			slots[i].setSoldOut(false);
		}
	}

	private static void displayInventory(VendingMachine vendingMachine) {
		ItemShelf[] slots = vendingMachine.inventory.getInventory();

		for (int i = 0; i < slots.length; i++) {
			System.out.print("Code number:" + slots[i].getCode() + " ");
			System.out.print("Item Type:" + slots[i].getItem().getType() + " ");
			System.out.print("Item Price:" + slots[i].getItem().getPrice() + " ");
			System.out.print("isAvailable:" + !slots[i].isSoldOut() + " ");

			System.out.println();
		}
	}

}
