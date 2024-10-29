package Model;

public class Sale {
	
	private Double totalValue = 0.0;
	Bread b = new Bread();
	Soda s = new Soda();
	Pumpkin p = new Pumpkin();

	public void sellBread(Integer qtd) {
		b.setAmount(b.getAmount()- qtd);
		this.totalValue += b.getPrice()*qtd;
	}
	
	public void sellSoda(Integer qtd) {
		s.setAmount(s.getAmount()- qtd);
		this.totalValue += s.getPrice()*qtd;
	}
	
	public void sellPupkim(Integer qtd) {
		p.setAmount(p.getAmount()- qtd);
		this.totalValue += p.getPrice()*qtd;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	
	
}