package griffio.beans.processor;

import com.google.common.base.Supplier;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Provider;

/**
 * Processor is true when the provided date is equal to the supplied day of the week
 */
@Component(value = "dayOfWeek")
public class DayOfWeekProcessor implements Processor<Boolean> {

    private final Provider<LocalDate> currentDate;
    private final Supplier<Integer> isoDayOfWeek;

    @Autowired
    public DayOfWeekProcessor(@Qualifier("systemDate") Provider<LocalDate> currentDate, @Qualifier("isoDayOfWeek") Supplier<Integer> isoDayOfWeek) {
        this.currentDate = currentDate;
        this.isoDayOfWeek = isoDayOfWeek;
    }

    public Boolean execute() {
        return currentDate.get().getDayOfWeek() == isoDayOfWeek.get();
    }

}
