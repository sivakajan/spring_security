package secur.demo.Controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secur.demo.Model.mystudent;
import secur.demo.Service.mystudentservice;

import java.util.List;

@RestController
@RequestMapping(path = "/sample")
public class mystudentcontroller {

    @Autowired
    private mystudentservice myservice;

    @GetMapping("/hi")
    public String hi()
    {
        return "hi";
    }

    @PostMapping("/add")
    public mystudent getdetails(mystudent myst)
    {
      return   myservice.getdetails(myst);
    }


    @GetMapping("/every")
    public Iterable<mystudent> all()
    {
        return myservice.allstu();
    }


}
