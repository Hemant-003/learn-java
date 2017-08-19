import exceptions.PersonNotFoundException;

import java.util.*;

class AdvancedSplitWise {
    private int numberOfPeople;
    private Transaction advance = new Transaction(0, new Date());
    ArrayList<Person> people = new ArrayList<>();

    public void collectMoney() {
        System.out.println(numberOfPeople);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter person " + (i + 1) + " name");
            String name = s.next();
            System.out.println("Enter amount to be paid by " + name);
            int amount = s.nextInt();

            people.add(new Person(name));
        }
    }

    public void takeAdvance(Person p) {

        people.add(p);
    }


    void addExpense(Person p, Transaction e) {
        p.spend(e);
        //Should return money. Should remove from advance.
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (Person person : people) {
            toString.append(person.toString());
        }

        return toString.toString();
    }

    public void addPerson(Person person) {
        people.add(person);
        this.numberOfPeople++;
    }


    public Transaction advanceFor(int month) {
        // Read about chaining of streams
        return people.stream().map(p -> p.getAdvanceForMonth(month)).reduce(new Transaction(), Transaction::add);
    }

//    public Transaction expenseFor(int month) {
//        // Read about chaining of streams
//        return people.stream().map(p -> p.getExpenseForMonth(month)).reduce(new Transaction(), Transaction::add);
//    }

    public Person findPerson(String s) {
        for (Person p : people) {
            if (p.is(s)) {
                return p;
            }
        }
        throw new PersonNotFoundException("Wrong Name entered");
    }
}