package secur.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secur.demo.Model.mystudent;
import secur.demo.Repository.student;

@Service
public class mystudentservice {
    @Autowired
    public student student;

    public mystudent getdetails(mystudent my) {
        return student.save(my);
    }

    public Iterable<mystudent> allstu()
    {
        return student.findAll();
    }
}
