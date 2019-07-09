package vo;

public class InventoryVO {

	private int inventory_id;
	private String mem_id;
	private int product_id;
	
	public InventoryVO() { }

	public InventoryVO(int inventory_id, String mem_id, int product_id) {
		this.inventory_id = inventory_id;
		this.mem_id = mem_id;
		this.product_id = product_id;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
}
