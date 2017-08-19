import org.junit.Before;
import org.junit.Test;
import util.Util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Optional;

import static org.junit.Assert.*;

public class PersonTest {
    Person raj;
    @Before
    public void setUp(){
        raj = new Person("Raj");
    }

    @Test
    public void testAddAdvance() throws ParseException {
        raj.addAdvance(new Expense(1000, Util.getDate("12/12/2012")));

        Expense advanceForMonth = raj.getAdvanceForMonth(Calendar.DECEMBER);
        assertEquals(1000 ,advanceForMonth.amount);
    }

    @Test
    public void getAdvanceForMonths() throws ParseException {
        raj.addAdvance(new Expense(1000, Util.getDate("12/12/2012")));
        raj.addAdvance(new Expense(900, Util.getDate("12/11/2012")));

        Expense advanceForMonthOfDecember = raj.getAdvanceForMonth(Calendar.DECEMBER);
        Expense advanceForMonthNovember = raj.getAdvanceForMonth(Calendar.NOVEMBER);
        assertEquals(1000 ,advanceForMonthOfDecember.amount);
        assertEquals(900 ,advanceForMonthNovember.amount);
    }


    @Test
    public void getAdvancePaidTwiceForSameMonth() throws ParseException {
        raj.addAdvance(new Expense(1000, Util.getDate("12/12/2012")));
        raj.addAdvance(new Expense(900, Util.getDate("13/12/2012")));

        Expense advanceForMonthOfDecember = raj.getAdvanceForMonth(Calendar.DECEMBER);
        assertEquals(1900 ,advanceForMonthOfDecember.amount);
    }

}