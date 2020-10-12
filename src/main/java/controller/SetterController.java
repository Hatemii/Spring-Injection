package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.MyService;

@Controller
public class SetterController {

    private MyService myService;

    @Autowired
    public void setMyService(MyService myService){
        this.myService = myService;
    }

    public String saySomething(){
        return myService.getHello();
    }

}
