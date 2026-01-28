package boundary;

import control.CountItemController;
import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;

public class CountItemBoundary {
    private CountItemController controller;
    private LibraryItemDAO dao;

    public CountItemBoundary() {
        dao = new MemoryLibraryItemDAO();   // ✅ Khởi tạo DAO
        controller = new CountItemController(dao);
    }

    public void show() {
        controller.executeStatistic();
    }
}
