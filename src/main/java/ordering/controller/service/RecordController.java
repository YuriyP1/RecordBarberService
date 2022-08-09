package ordering.controller.service;


import ordering.dao.service.RecordDao;
import ordering.model.service.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/record")
public class RecordController {

    RecordDao recordDao;

    @Autowired
    public RecordController(RecordDao recordDao){
        this.recordDao = recordDao;
    }

    @GetMapping("/record-page")
    public String toRecord(Model model){
        System.out.println("попал в /record-page ");
        model.addAttribute("record", new Record());
        return "service/record-page";
    }

    @PostMapping()
    public String createRecord(@RequestParam("name") String name,
                          @RequestParam("phone") String phone,
                          @RequestParam("email") String email,
                          @RequestParam("data") String data,
                          @RequestParam("time") String time){

        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(data);
        System.out.println(time);
        return "service/record-success";
    }
}
