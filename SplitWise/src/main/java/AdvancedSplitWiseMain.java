import java.util.Scanner;

class AdvancedSplitWiseMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(args[0]);
        AdvancedSplitWise splitWise = new AdvancedSplitWise(numberOfPeople);
        splitWise.collectMoney();

        while (true){
            System.out.println("Options:\n1.Add Expense by person\n2.View all people\n\n");
            int choice = s.nextInt();
            switch (choice){
                case 1: break;//splitWise.addExpense();
                case 2: System.out.println(splitWise); break;
                default:break;
            }
        }
    }
}