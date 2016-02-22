package hello;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("/dropDown")
    public String serveDropDown(Model model) {
        ArrayList<DropDownEntry> dropDownEntryList = new ArrayList<>();
        dropDownEntryList.add(new DropDownEntry("1", "Erster Eintrag"));
        dropDownEntryList.add(new DropDownEntry("2", "Zweiter Eintrag"));
        dropDownEntryList.add(new DropDownEntry("3", "Dritter Eintrag"));

        FormBean formBean = new FormBean(dropDownEntryList);
        model.addAttribute("formBean", formBean);
        return "dropDown";
    }

}