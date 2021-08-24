package bigg.controller;

import bigg.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("counter")
public class CounterControll {

    @ModelAttribute("counter")
    public Counter setCounter() {
        return new Counter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("counter") Counter counter) {
        counter.setCount(counter.getCount() + 1);
        return "/home";
    }
}
