package starwolf.home.aqrsupreme;

import org.junit.Test;

import starwolf.home.aqrsupreme.models.aqdata.DataPair;

import static org.junit.Assert.*;

public class DataPairUnitTest {
    byte[] bt = new byte[] {0x00, 0x00};
    DataPair dp = new DataPair("TestDataPair", bt);

    @Test
    public void DataPair_Title() {
        assertEquals("TestDataPair", dp.GetTitle());
    }

    @Test
    public void DataPair_IntConversion1() { assertEquals(0, dp.GetDataValue()); }

    @Test
    public void DataPair_IntConversion2() {
        dp.SetDataValue(new byte[] {0x00, 0x01});
        assertEquals(1, dp.GetDataValue());
    }
    @Test
    public void DataPair_IntConversion3() {
        dp.SetDataValue(new byte[] {0x00, 0x02});
        assertEquals(2, dp.GetDataValue());
    }
}
