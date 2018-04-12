import com.kstruct.gethostname4j.Hostname;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * Created by avec on 12/04/2018.
 */
public class Application {
    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        System.setProperty("hostname", Hostname.getHostname());

        Application app = new Application();
        app.run();
    }

    private void run() {
        logger.info("Running application on {}", System.getProperty("os.name"));
    }
}
