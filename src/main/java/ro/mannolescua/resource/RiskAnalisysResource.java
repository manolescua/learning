package ro.mannolescua.resource;

/**
 * Created by Aurelian on 10/8/2015.
 */
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello-world")
public class RiskAnalisysResource {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody RiskAnalisysDTO sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new RiskAnalisysDTO(counter.incrementAndGet(), String.format(template, name));
    }

}
