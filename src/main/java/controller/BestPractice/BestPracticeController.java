package controller.BestPractice;

import org.springframework.stereotype.Controller;
import services.BestPractice.BestPracticeService;

@Controller
public class BestPracticeController {
    private final BestPracticeService bestPracticeService;

    public BestPracticeController(BestPracticeService bestPracticeService) {
        this.bestPracticeService = bestPracticeService;
    }

    public String saySomething(){
        return bestPracticeService.getHello();
    }
}
