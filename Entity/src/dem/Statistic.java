package dem;

import dao.LibraryItemDAO;
import entity.LibraryItem;

public class Statistic {

    public int countByType(String type) {
        int count = 0;
        for (LibraryItem item : LibraryItemDAO.getAll()) {
            if (item.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }
}
