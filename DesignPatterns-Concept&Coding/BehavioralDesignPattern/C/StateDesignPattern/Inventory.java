package C.StateDesignPattern;

public class Inventory {
	
	ItemShelf[] inventory;

	Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

	private void initialEmptyInventory() {
		int startCode=101;
		for(int i=0;i<inventory.length;i++) {
			ItemShelf shelf=new ItemShelf();
			shelf.setCode(startCode);
			shelf.setSoldOut(true);
			startCode++;
			inventory[i]=shelf;
		}
		
	}

	public ItemShelf[] getInventory() {
		return inventory;
	}

	public void setInventory(ItemShelf[] inventory) {
		this.inventory = inventory;
	}
	
	public Item getItem(int code) throws Exception {
		for(ItemShelf itemShelf:inventory) {
			if(itemShelf.getCode()==code) {
				if(itemShelf.isSoldOut()) {
					 throw new Exception("item already sold out");
				}else {
					return itemShelf.item;
				}
			}
			
		}
		 throw new Exception("Invalid code");
	}

	public void updateSoldOutItem(int codeNumber) {
		for(ItemShelf itemShelf:inventory) {
			if(itemShelf.getCode()==codeNumber) {
				itemShelf.setSoldOut(true);
			}
			}
	}

}
