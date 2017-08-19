enum TransactionType {
    CREDIT,
    DEBIT
}

public class TransactionInformation implements Comparable{
    Transaction transaction;
    TransactionType type;
    int balance;

    public TransactionInformation(Transaction x, TransactionType credit) {
        transaction = x;
        type = credit;

    }

    public int getAmount() {
        if (type == TransactionType.CREDIT)
            return transaction.amount;
        return -1 * transaction.amount;
    }

    @Override
    public String toString() {
        return "transaction=" + transaction +
                ", type=" + type +
                ", balance=" + balance + "\n";
    }

    @Override
    public int compareTo(Object o) {
        TransactionInformation that = (TransactionInformation)o;
        return this.transaction.compareTo(that.transaction);
    }
}
