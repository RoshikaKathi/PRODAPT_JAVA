package collectionsAndSortingExc;

public class Product {
	private Long productId;
	private String name;
	private String category;
	private Double price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(Long productId, String name, String category, Double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public Long getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public Double getPrice() {
		return price;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price
				+ "]";
	}
	
	
}
