package vo;

public class IngredientVO {

	private String ingredient_id;
	private String ingredient_name;
	private int product_id;
	private String ingreditype_id;
	
	public IngredientVO() { }

	public IngredientVO(String ingredient_id, String ingredient_name, int product_id, String ingreditype_id) {
		this.ingredient_id = ingredient_id;
		this.ingredient_name = ingredient_name;
		this.product_id = product_id;
		this.ingreditype_id = ingreditype_id;
	}

	public String getIngredient_id() {
		return ingredient_id;
	}

	public void setIngredient_id(String ingredient_id) {
		this.ingredient_id = ingredient_id;
	}

	public String getIngredient_name() {
		return ingredient_name;
	}

	public void setIngredient_name(String ingredient_name) {
		this.ingredient_name = ingredient_name;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getIngreditype_id() {
		return ingreditype_id;
	}

	public void setIngreditype_id(String ingreditype_id) {
		this.ingreditype_id = ingreditype_id;
	}
	
}
