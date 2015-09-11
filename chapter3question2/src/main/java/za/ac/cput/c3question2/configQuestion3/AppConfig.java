package za.ac.cput.c3question2.configQuestion3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.c3question2.BusClass;
import za.ac.cput.c3question2.BusInterface;

/**
 * Created by student on 2015/02/19.
 */
@Configuration

public class AppConfig
{
    @Bean(name = "bus")
    public BusInterface getBus(){return new BusClass();}

}
