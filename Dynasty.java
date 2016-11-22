public class Dynasty{                  
	 
	public static int CountPeople(int i, int z, int sumBegin, int sumPeople, int sumAge) {
	    sumBegin = sumAge * sumBegin;
		sumPeople = sumPeople + sumBegin;
		if ((i%2) != 0){
			sumAge = sumAge - 2;
		}
		else{
			sumAge = sumAge + 1;
		}			
		if (i < z) {
			return CountPeople(++i, z, sumBegin, sumPeople, sumAge);
		}
		else{
			return sumPeople;
		}
	}
	
	public static void main(String[] args){
		int z = Integer.parseInt(args[0]);    //последнее поколение
		int sumBegin = 1; //количество людей в самом начале
		int sumAge = 10; //количество людей в одной строке 
		int sumPeople = 0;
		int i = 1;
		System.out.println(CountPeople(i, z, sumBegin, sumPeople, sumAge));
	}
}

