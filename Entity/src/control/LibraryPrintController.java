package control;

import entity.*;
import java.util.ArrayList;

public class LibraryPrintController {

    public String printAll(ArrayList<LibraryItem> list) {
        if (list == null || list.isEmpty()) {
            return "Danh sach rong";
        }

        String result = "";

        for (LibraryItem item : list) {
            result += "Ma: " + item.getId() + "\n";
            result += "Tieu de: " + item.getTitle() + "\n";

            if (item instanceof Book) {
                Book b = (Book) item;
                result += "Loai: Sach\n";
                result += "So trang: " + b.getValue() + "\n";
            }

            if (item instanceof DVD) {
                DVD d = (DVD) item;
                result += "Loai: DVD\n";
                result += "Thoi luong: " + d.getValue() + " phut\n";
            }

            if (item instanceof Magazine) {
                Magazine m = (Magazine) item;
                result += "Loai: Tap chi\n";
                result += "So phat hanh: " + m.getValue() + "\n";
            }

            result += "----------------------\n";
        }

        return result;
    }
}