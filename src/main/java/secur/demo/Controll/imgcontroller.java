package secur.demo.Controll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/img")

public class imgcontroller {


    @RequestMapping(method = RequestMethod.GET, path = "text/html")
    @ResponseBody
    public ModelAndView fo()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("for.html");
        return modelAndView;
    }
}
