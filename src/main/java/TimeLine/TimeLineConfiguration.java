package TimeLine;

import io.dropwizard.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TimeLineConfiguration extends Configuration {
    private String test;
}
