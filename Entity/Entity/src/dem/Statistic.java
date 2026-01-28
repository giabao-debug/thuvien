package dem;

import dao.LibraryItemDAO;
import entity.LibraryItem;

public class Statistic {

    private LibraryItemDAO dao;

    public Statistic(LibraryItemDAO dao) {
        this.dao = dao;
    }

    public int countByType(String type) {
        int count = 0;
        for (LibraryItem item : dao.getAll()) {   // ✅ luôn lấy DB mới nhất
            if (item.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }
}
