package de.codecentric.burger.model;

import java.util.List;

/**
 * @author Holger Grosse-Plankermann (xd98714)
 */
public class SidesBean {

    private SidesEntry selectedElement;

    private List<SidesEntry> sidesEntryList;

    public SidesBean(List<SidesEntry> sidesEntryList) {
        this.sidesEntryList = sidesEntryList;
    }

    public List<SidesEntry> getSidesList() {
        return sidesEntryList;
    }

    public void setSidesList(List<SidesEntry> sidesEntryList) {
        this.sidesEntryList = sidesEntryList;
    }

    public SidesEntry getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(SidesEntry selectedElement) {
        this.selectedElement = selectedElement;
    }
}
