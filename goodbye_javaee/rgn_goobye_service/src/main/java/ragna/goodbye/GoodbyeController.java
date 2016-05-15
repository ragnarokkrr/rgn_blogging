package ragna.goodbye;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ragnarokkrr on 5/3/16.
 */
@RestController
@ConfigurationProperties(prefix = "goodbye")
public class GoodbyeController {
    private static final String template = "[%s] Goodbye JavaEE Monolith";
    private final AtomicLong counter = new AtomicLong();

    @Value("#{environment.GOODBYE_INSTANCE ?:'NO_INSTANCE_SET'}")
    private String instanceId;

    @RequestMapping("/goodbye")
    public Goodbye goodbye (@RequestParam(value="name", defaultValue = "default node") String name){
        return new Goodbye(instanceId, counter.incrementAndGet(), String.format(template, name));
    }
}
