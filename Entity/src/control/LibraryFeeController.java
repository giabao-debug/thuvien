package control;

import entity.*;
import java.util.ArrayList;

public class LibraryFeeController {

    public ArrayList<LibraryItem> filterFeeGreaterThan(
            ArrayList<LibraryItem> list, int days, double fee) {

        ArrayList<LibraryItem> result = new ArrayList<>();
        for (LibraryItem i : list) {
            if (i.calculateFee(days) > fee) {
                result.add(i);
            }
        }
        return result;
    }
}