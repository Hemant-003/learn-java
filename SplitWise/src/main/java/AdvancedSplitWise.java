import java.util.*;

class AdvancedSplitWise {
    int numberOfPeople;
    Expense advance;
    ArrayList<Person> people;

    public AdvancedSplitWise(int numberOfPeople) {
        people = new ArrayList(numberOfPeople);
        this.numberOfPeople = numberOfPeople;
    }

    public void collectMoney() {
        System.out.println(numberOfPeople);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter person " + (i + 1) + " name");
            String name = s.next();
            System.out.println("Enter amount to be paid by " + name);
            int amount = s.nextInt();

            people.add(new Person(name, amount));
        }
    }

    public void takeAdvance(Person p, Expense advance) {
        int x, y;

        // x++; x is operand, ++ is operator -> One operand is unary
        // x+y; x and y is operand, + is operator -> Two operand is binary
        people.add(p);
    }


    public void addExpense(Person p, Expense e) {
        //Should return money. Should remove from advance.
    }

    public void print() {
        for (Person person:people) {
            System.out.println(person);
        }
    }
}