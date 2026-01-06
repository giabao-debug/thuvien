
package control;
import entity.*;
import java.util.ArrayList;

public class SearchItemController {
    public LibraryItem findById(ArrayList<LibraryItem> list, long id) {
    for (LibraryItem item : list) {
        if (item.getId() == id) {
            return item;
        }
    }
    return null;
}
}