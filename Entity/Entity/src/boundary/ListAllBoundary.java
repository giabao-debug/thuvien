
package boundary;

import control.ListAllController;
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import util.UIExceptionHandler;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListAllBoundary {
    private LibraryItemDAO dao;
    public ListAllBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show() {
        try {
            ListAllController control = new ListAllController(dao);
            ArrayList<LibraryItemDTO> list = control.listAll();

            if (list.isEmpty()) {
                UIExceptionHandler.showInfo("Không có tài liệu nào trong hệ thống");
                return;
            }

            StringBuilder sb = new StringBuilder("📖 DANH SÁCH TÀI LIỆU\n\n");

            for (LibraryItemDTO dto : list) {
                sb.append(dto.formatDisplay()).append("\n");

                switch (dto.getType().toLowerCase()) {
                    case "book":
                        sb.append("Page: ").append(dto.getValue());
                        break;
                    case "dvd":
                        sb.append("Duration: ").append(dto.getValue());
                        break;
                    case "magazine":
                        sb.append("Issue Number: ").append(dto.getValue());
                        break;
                    default:
                        sb.append("Value: ").append(dto.getValue());
                }

                sb.append("\n--------------------\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString());
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}