import org.junit.Before;
import org.junit.Test;
import util.Util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {
    Person raj;
    @Before
    public void setUp(){
        raj = new Person("Raj");
    }

    @Test
    public void testAddAdvance() throws ParseException {
        raj.add(new Transaction(1000, Util.getDate("12/12/2012")));

        Transaction advanceForMonth = raj.getAdvanceForMonth(Calendar.DECEMBER);
        assertEquals(1000 ,advanceForMonth.amount);
    }

    @Test
    public void getAdvanceForMonths() throws ParseException {
        raj.add(new Transaction(1000, Util.getDate("12/12/2012")));
        raj.add(new Transaction(900, Util.getDate("12/11/2012")));

        Transaction advanceForMonthOfDecember = raj.getAdvanceForMonth(Calendar.DECEMBER);
        Transaction advanceForMonthNovember = raj.getAdvanceForMonth(Calendar.NOVEMBER);
        assertEquals(1000 ,advanceForMonthOfDecember.amount);
        assertEquals(900 ,advanceForMonthNovember.amount);
    }


    @Test
    public void getAdvancePaidTwiceForSameMonth() throws ParseException {
        raj.add(new Transaction(1000, Util.getDate("12/12/2012")));
        raj.add(new Transaction(900, Util.getDate("13/12/2012")));

        Transaction advanceForMonthOfDecember = raj.getAdvanceForMonth(Calendar.DECEMBER);
        assertEquals(1900 ,advanceForMonthOfDecember.amount);
    }

    @Test
    public void testStatement() throws Exception {
        raj.add(new Transaction(900, Util.getDate("04/12/2014")));
        raj.add(new Transaction(1000, Util.getDate("06/12/2014")));
        raj.spend(new Transaction(900, Util.getDate("08/12/2014")));
        raj.spend(new Transaction(2900, Util.getDate("10/12/2014")));
        raj.spend(new Transaction(2900, Util.getDate("10/11/2014")));

        List<TransactionInformation> statement = raj.statement(Calendar.DECEMBER);

        assertEquals(4, statement.size());

        assertEquals(900, statement.get(0).balance);
        assertEquals(1900, statement.get(1).balance);
        assertEquals(1000, statement.get(2).balance);
        assertEquals(-1900, statement.get(3).balance);
    }

    @Test
    public void testExpenses() throws ParseException {
        raj.add(new Transaction(1000, Util.getDate("06/12/2014")));
        raj.spend(new Transaction(900, Util.getDate("08/12/2014")));
        raj.spend(new Transaction(2900, Util.getDate("10/12/2014")));
        List<Transaction> expenses = raj.expenses();

        assertEquals(2, expenses.size());

        assertEquals(900, expenses.get(0).amount);
        assertEquals(2900, expenses.get(1).amount);
    }

    @Test
    public void testExpensesForMonth() throws ParseException {
        raj.spend(new Transaction(1000, Util.getDate("06/11/2014")));
        raj.spend(new Transaction(900, Util.getDate("08/12/2014")));
        raj.spend(new Transaction(2900, Util.getDate("10/12/2014")));
        List<Transaction> expenses = raj.expenses(Calendar.DECEMBER);

        assertEquals(2, expenses.size());

        assertEquals(900, expenses.get(0).amount);
        assertEquals(2900, expenses.get(1).amount);
    }


}