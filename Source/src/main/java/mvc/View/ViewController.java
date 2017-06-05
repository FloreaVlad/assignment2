package mvc.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/BookApp/")
    public String test()
    {
        return "index";
    }
}
