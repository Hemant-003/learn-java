import java.util.List;

public interface ExpenseSimplifier {
    List<Transaction> statement();

    List<Transaction> statement(int month);

    List<Transaction> dues(Person person);


}

interface PeopleManager {
    void add(Person p);

    void deprecate(Person p);
}

interface Persona {
    void add(Transaction t);

    void spend(Transaction t);

    List<Transaction> expenses(int month);

    List<Transaction> expenses();

    List<TransactionInformation> statement(int month);

    void settleUp(Transaction t);
}