import java.util.Date;

class Transaction implements Comparable {
    int amount;
    Date date = new Date();

    Transaction(int amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    Transaction() {

    }

    @Override
    public String toString() {
        return "" + amount + " " + date;
    }

    void reduce(Transaction e) {
        amount = amount - e.amount;
    }

    Transaction add(Transaction x) {
        this.amount = x.amount + this.amount;
        return this;
    }

    @Override
    public int compareTo(Object o) {
        Transaction that = (Transaction) o;
        return this.date.compareTo(that.date);
    }
}