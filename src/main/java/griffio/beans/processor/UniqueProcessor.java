package griffio.beans.processor;

import com.google.common.base.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Processor returns the next unique id
 * Main component
 */
@Component(value = "uniqueId")
@Primary
public class UniqueProcessor implements Processor<String> {

    private final Supplier<String> uniqueId;

    @Autowired
    public UniqueProcessor(@Qualifier("sequence") Supplier<String> uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String execute() {
        return uniqueId.get();
    }

}
