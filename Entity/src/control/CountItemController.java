package control;

import dem.Statistic;
import boundary.ResultBoundary;

public class CountItemController {

    private Statistic sta;
    private ResultBoundary result;

    public CountItemController() {
        sta = new Statistic();
        result = new ResultBoundary();
    }

    public void executeStatistic() {
        int book = sta.countByType("Book");
        int dvd = sta.countByType("DVD");
        int magazine = sta.countByType("Magazine");

        result.showResult(book, dvd, magazine);
    }
}
