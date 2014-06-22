package griffio.beans.unique;

import com.google.common.base.Supplier;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component(value = "guid")
public class GuidSupplier implements Supplier<String> {

    @Override
    public String get() {
        return UUID.randomUUID().toString();
    }
}
