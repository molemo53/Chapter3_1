package za.ac.cput.Chapter3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Chapter3.SmallCal;
import za.ac.cput.Chapter3.SmallCalInterface;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {

    @Bean(name = "calcu")
    public SmallCalInterface getCon()
    {
        return new SmallCal();
    }

}
