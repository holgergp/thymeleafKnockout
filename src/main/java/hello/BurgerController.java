package hello;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BurgerController {

    @RequestMapping("/helloBurger")
    public String serveHellowWorld(Model model) {

        return "burger";
    }

    @RequestMapping("/burger")
    @ResponseBody
    public BurgerBean eintrage(Model model) {
        ArrayList<BurgerEntry> burgerList = new ArrayList<>();
        burgerList.add(new BurgerEntry("1", "Hamburger"));
        burgerList.add(new BurgerEntry("2", "Cheese-Burger"));
        burgerList.add(new BurgerEntry("3", "The Killer"));

        BurgerBean burgerBean = new BurgerBean(burgerList);

        return burgerBean;
    }

}