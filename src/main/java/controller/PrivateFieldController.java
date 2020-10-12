package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.MyService;

@Controller
public class PrivateFieldController {

    @Autowired
    private MyService myService;

    public String saySomething(){
        return myService.getHello();
    }

}
