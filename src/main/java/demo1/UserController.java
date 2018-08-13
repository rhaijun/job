package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private Environment env;
    @RequestMapping("/info")
    public String info(){
        return env.getProperty("name");
    }
}
