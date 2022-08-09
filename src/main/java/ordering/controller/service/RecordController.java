package ordering.controller.service;


import ordering.dao.service.RecordDAO;
import ordering.model.service.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/record")
public class RecordController {

    RecordDAO recordDAO;

    @Autowired
    public RecordController(RecordDAO recordDAO){
        this.recordDAO = recordDAO;
    }

    @GetMapping("/record-page")
    public String toRecord(Model model){
        model.addAttribute("record", new Record());
        return "service/record-page";
    }

    @PostMapping()
    public String createRecord(@ModelAttribute("record") Record record){

        System.out.println(record.getEmail());
        recordDAO.createRecord(record);
        return "service/record-success";
    }
}
