package griffio.beans.processor;

import griffio.beans.day.DaySupplier;
import griffio.beans.inject.LocalDateProvider;
import org.joda.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.inject.Provider;

@Test
public class DayOfWeekProcessorTest {

    public void isDayOfWeekMonday() {

        Provider<LocalDate> mondayProvider = new LocalDateProvider(LocalDate.parse("2014-02-03"));
        Processor<Boolean> dayOfWeekProcessor = new DayOfWeekProcessor(mondayProvider, new DaySupplier());
        Assert.assertTrue(dayOfWeekProcessor.execute());

    }
}
