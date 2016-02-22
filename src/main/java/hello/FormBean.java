package hello;

import java.util.List;

/**
 * @author Holger Grosse-Plankermann (xd98714)
 */
public class FormBean {

    private DropDownEntry selectedElement;

    private List<DropDownEntry> dropDownEntryList;

    public FormBean(List<DropDownEntry> dropDownEntryList) {
        this.dropDownEntryList = dropDownEntryList;
    }

    public List<DropDownEntry> getDropDownEntryList() {
        return dropDownEntryList;
    }

    public void setDropDownEntryList(List<DropDownEntry> dropDownEntryList) {
        this.dropDownEntryList = dropDownEntryList;
    }

    public DropDownEntry getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(DropDownEntry selectedElement) {
        this.selectedElement = selectedElement;
    }
}
