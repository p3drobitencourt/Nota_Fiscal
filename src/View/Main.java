package View;
import Model.Sale;

public class Main {

	public static void main(String[] args) {

		Sale sale = new Sale();
		
		sale.sellBread(4);
		sale.sellPupkim(10);
		sale.sellSoda(2);
		
		System.out.println(sale.getTotalValue());
		
	}

}