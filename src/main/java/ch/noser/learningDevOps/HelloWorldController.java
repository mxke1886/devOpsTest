package ch.noser.learningDevOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return "Working!";
    }
}
