package services.BestPractice;

import org.springframework.stereotype.Service;

@Service
public class BestPracticeImplementation implements BestPracticeService {
    @Override
    public String getHello() {
        return "The Best Hello";
    }
}
