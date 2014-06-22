package griffio.beans.inject;

import org.joda.time.LocalDate;

import javax.inject.Provider;

public class LocalDateProvider implements Provider<LocalDate> {

    private final LocalDate localDate;

    public LocalDateProvider(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public LocalDate get() {
        return localDate;
    }
}
