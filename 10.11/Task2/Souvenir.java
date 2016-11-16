class Souvenir implements Sellable, Deliverable, Popularity, Sale {
 
    private String country;
    private int price;
	public long pop = (int) (Math.random() * 10);
	public long days = pop * 2 + 1;
	
 
    Souvenir(String country, int price){
        this.country = country;
        this.price = price;
    }
	
    public void printPrice() {
        System.out.printf("Souvenir (country %s) costs %d rubles .\n", country, price);    //стоимость
    }
	
	public void printSale() {
		if (pop == 9) {
			System.out.println("Congratulations! Your sale is 20%. New sale: " + Math.round(price*0.8) + "rubles.");
	    }
	}
	
	public void printPopularity () {
		System.out.println("Popularity of souvenir: " + pop + "/10.");
	}
	
	public void printDeliver () {
		System.out.println("Souvenir will be delivered in " + days + " days.");
	}
	
	int getPrice(){
        return price;
    }
	
	String getCountry(){
        return country;
    }
}