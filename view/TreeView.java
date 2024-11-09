package view;

import model.Person;
import java.util.List;

public interface TreeView {
    void displayMessage(String message);
    void displayPersons(List<Person> persons);
    String getUserInput();
    <TreePresenter> void setPresenter(TreePresenter presenter);
}