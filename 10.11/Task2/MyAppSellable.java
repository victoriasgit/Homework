public class MyAppSellable {

    public static void main(String[] args) {
         
        Souvenir souvenir = new Souvenir("Russia", 550);
		Toy toy = new Toy("Russia", 1500);
		
		toy.printPrice();
		toy.printPopularity();
		toy.printSale();
		toy.printDeliver();
		souvenir.printSale();
		souvenir.printPrice();
		souvenir.printPopularity();
		souvenir.printDeliver();
    }
}