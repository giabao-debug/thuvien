package control;

import boundary.ResultBoundary;
import dem.Statistic;
import dao.LibraryItemDAO;

public class CountItemController {

    private Statistic statistic;
    private ResultBoundary result;
    private LibraryItemDAO dao;

    public CountItemController(LibraryItemDAO dao) {

        // ✅ Bảo vệ không cho truyền null
        if (dao == null) {
            throw new IllegalArgumentException("LibraryItemDAO cannot be null");
        }

        this.dao = dao;
        this.statistic = new Statistic(dao);   // ✅ truyền DAO đúng
        this.result = new ResultBoundary();
    }

    public void executeStatistic() {
        try {
            int book = statistic.countByType("Book");
            int dvd = statistic.countByType("DVD");
            int magazine = statistic.countByType("Magazine");

            result.showResult(book, dvd, magazine);

        } catch (Exception e) {
            System.err.println("❌ Statistic failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
