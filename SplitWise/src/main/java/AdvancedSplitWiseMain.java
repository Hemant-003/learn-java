class AdvancedSplitWiseMain {
	public static void main(String[] args) {
		int numberOfPeople = Integer.parseInt(args[0]);
		AdvancedSplitWise splitWise = new AdvancedSplitWise(numberOfPeople);
		splitWise.collectMoney();
		System.out.println("**");
		System.out.println(splitWise);
	}
}