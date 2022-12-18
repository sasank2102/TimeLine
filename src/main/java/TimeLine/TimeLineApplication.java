package TimeLine;

import TimeLine.health.TestHealthCheck;
import TimeLine.resources.TimeLineResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TimeLineApplication extends Application<TimeLineConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TimeLineApplication().run(args);
    }

    @Override
    public String getName() {
        return "TimeLine";
    }

    @Override
    public void initialize(final Bootstrap<TimeLineConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TimeLineConfiguration configuration,
                    final Environment environment) {
        environment.health().healthChecks().register("testHC", new TestHealthCheck());
        environment.jersey().register(new TimeLineResource());
    }

}
