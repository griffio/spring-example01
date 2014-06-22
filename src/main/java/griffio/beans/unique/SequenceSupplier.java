package griffio.beans.unique;

import com.google.common.base.Supplier;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component(value = "sequence")
public class SequenceSupplier implements Supplier<String> {

    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public String get() {
        return String.format("id:%d", sequence.incrementAndGet());
    }
}
