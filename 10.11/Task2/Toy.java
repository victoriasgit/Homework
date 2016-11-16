public class Toy implements Sellable, Popularity, Deliverable, Sale {
 
	private String country;
    private int price;
	public long pop = (int) (Math.random() * 10);
	public long days = pop * 2 + 1;
  
    Toy(String country, int price){    
        this.country = country;
		this.price = price;
    }
	
	public void printPrice() {
        System.out.printf("Toy (country %s) costs %d rubles .\n", country, price);   //стоимость
    }
	
	public void printSale() {
		if (pop == 9) {
			System.out.println("Congratulations! Your sale is 20%. New sale: " + Math.round(price*0.8) + "rubles.");
	    }
	}
	
	public void printPopularity () {
		System.out.println("Popularity of toy: " + pop + "/10.");
	}
	
	public void printDeliver () {
		System.out.println("Toy will be delivered in " + days + " days.");
	}
	
	int getPrice(){
        return price;
    }
	
	String getCountry(){
        return country;
    }
}