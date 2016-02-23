package de.codecentric.burger.model;

import java.util.List;

/**
 * @author Holger Grosse-Plankermann (xd98714)
 */
public class BurgerBean {

    private BurgerEntry selectedElement;

    private List<BurgerEntry> burgerEntryList;

    public BurgerBean(List<BurgerEntry> burgerEntryList) {
        this.burgerEntryList = burgerEntryList;
    }

    public List<BurgerEntry> getBurgerEntryList() {
        return burgerEntryList;
    }

    public void setBurgerEntryList(List<BurgerEntry> burgerEntryList) {
        this.burgerEntryList = burgerEntryList;
    }

    public BurgerEntry getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(BurgerEntry selectedElement) {
        this.selectedElement = selectedElement;
    }
}
