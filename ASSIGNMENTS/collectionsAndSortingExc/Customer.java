package collectionsAndSortingExc;


public class Customer {
	private Long customerId;
	private String customerName;
	private Integer tier;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long customerId, String customerName, Integer tier) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.tier = tier;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Integer getTier() {
		return tier;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", tier=" + tier + "]";
	}
	
}
