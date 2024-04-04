package collectionsAndSortingExc;

import java.time.LocalDate;

public class Order {
	private Long orderId;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	private Long customerId;
	//private List<Product> products;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long orderId, LocalDate orderDate, LocalDate deliveryDate, String status, Long customerId) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customerId = customerId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + ", customerId=" + customerId + "]";
	}
	
}
