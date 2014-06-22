package griffio.beans.day;

import com.google.common.base.Supplier;
import org.joda.time.DateTimeConstants;
import org.springframework.stereotype.Component;

/**
 * Returns a day of the week as an iso number
 */
@Component(value = "isoDayOfWeek")
public class DaySupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        return DateTimeConstants.MONDAY;
    }
}
