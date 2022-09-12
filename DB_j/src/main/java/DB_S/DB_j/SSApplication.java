package DB_S.DB_j;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class SSApplication extends Application<SSConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SSApplication().run(args);
    }

    @Override
    public String getName() {
        return "SS";
    }

    @Override
    public void initialize(final Bootstrap<SSConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SSConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
