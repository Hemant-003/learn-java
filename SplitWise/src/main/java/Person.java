import util.Util;

import java.util.*;

class Person {
    String name;
    ArrayList<Expense> expense = new ArrayList<>();
    ArrayList<Expense> advance = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void spent(Expense spent){

    }

    @Override
    public String toString(){
        return name + "\t" + advance;
    }

    void spend(Expense e) {
        expense.add(e);
    }

    Expense getAdvanceForMonth(int month){
        Expense expenseForMonthOf = new Expense();
        for (Expense e : advance) {
            int expenseForMonth = Util.getMonth(e.date);
            if (month == expenseForMonth)
                expenseForMonthOf.add(e);
        }
        return expenseForMonthOf;
    }

    Expense getExpenseForMonth(int month){
        return expense.stream().filter(e -> Util.getMonth(e.date) == month).reduce(new Expense(), Expense::add);
    }

    void addAdvance(Expense expense) {
        advance.add(expense);
    }

    public boolean is(String s) {
        return s.equals(name);
    }
}
