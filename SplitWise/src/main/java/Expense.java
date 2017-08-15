class Expense {
    int amount;
    String month;

    public Expense(int amount){
        this.amount = amount;
    }

    @Override
    public java.lang.String toString() {
        return "" + amount;
    }
}