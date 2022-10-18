import no.ashti.Oblig2.Leap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapTest {


    Leap leap;
    @BeforeEach
    void setup(){
        leap = new Leap();
    }

    @Test
    public void divisible_by_4_but_not_100(){
        assertTrue(leap.isLeapYear(2016));
    }
    @Test
    public void divisible_by_4_and_100_but_not_400(){
        assertFalse(leap.isLeapYear(1700));
    }
    @Test
    public void divisible_by_4_and_100_and_400(){
        assertTrue(leap.isLeapYear(2000));
    }

    @Test
    public void year_2200_is_not_a_leap_year(){
        assertFalse(leap.isLeapYear(2200));
    }
    @Test
    public void year_2400_is_a_leap_year(){
        assertTrue(leap.isLeapYear(2400));
    }
    @Test
    public void year_2500_is_not_a_leap_year(){assertFalse(leap.isLeapYear(2500));}
    @Test
    public void year_2600_is_a_leap_year(){
        assertTrue(leap.isLeapYear(2048));
    }






}