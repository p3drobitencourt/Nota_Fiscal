package Model;

public class Soda implements Product{

	private Integer amount = 2;
	private Double price = 5.0;
	

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public void amountStock() {
		this.getAmount();
	}

	@Override
	public void valueProduct() {
		this.getPrice();
	}

}