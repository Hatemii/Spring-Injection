package controller;

import org.springframework.stereotype.Controller;
import services.MyService;

@Controller
public class ConstructorController {
    private MyService myService;

    // @Autowired is optional when you use constructor
    public ConstructorController(MyService myService) {
        this.myService = myService;
    }

    public String saySomething(){
        return myService.getHello();
    }

}
