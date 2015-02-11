package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(method=RequestMethod.GET, value={"/"})
    public String index() {
        return "Hello World!";
    }

}
