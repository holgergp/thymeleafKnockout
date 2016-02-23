package de.codecentric.burger.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import de.codecentric.burger.command.BurgerNeuIntent;
import de.codecentric.burger.model.BurgerBean;
import de.codecentric.burger.model.BurgerEntry;
import de.codecentric.burger.model.SidesBean;
import de.codecentric.burger.model.SidesEntry;

@Controller
public class BurgerController {

    @RequestMapping("/helloBurger")
    public String serveHellowWorld(Model model) {
        model.addAttribute("burgerNeuIntent", new BurgerNeuIntent());
        return "burger";
    }

    @RequestMapping("/burger")
    @ResponseBody
    public BurgerBean burger(Model model) {
        ArrayList<BurgerEntry> burgerList = new ArrayList<>();
        burgerList.add(new BurgerEntry("1", "Hamburger"));
        burgerList.add(new BurgerEntry("2", "Cheese-Burger"));
        burgerList.add(new BurgerEntry("3", "The Killer"));

        BurgerBean burgerBean = new BurgerBean(burgerList);

        return burgerBean;
    }

    @RequestMapping("/sides")
    @ResponseBody
    public SidesBean sides(Model model) {
        ArrayList<SidesEntry> sidesList = new ArrayList<>();
        sidesList.add(new SidesEntry("1", "Fries"));
        sidesList.add(new SidesEntry("2", "Sweet Potatto Fries"));
        sidesList.add(new SidesEntry("3", "Coleslaw"));

        SidesBean sidesBean = new SidesBean(sidesList);

        return sidesBean;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    /**
     * Lege die Bankdaten an
     */
    public String saveForm(BurgerNeuIntent burgerNeuIntent, BindingResult bindingResultEO, Model model,
            final RedirectAttributes redirectAttributes) {
        return "/burger";
    }

}