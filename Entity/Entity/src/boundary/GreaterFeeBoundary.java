
package boundary;

import control.GreaterFeeController;
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import util.UIExceptionHandler;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GreaterFeeBoundary {
    private LibraryItemDAO dao;
    public GreaterFeeBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show() {
        try {
            String input = JOptionPane.showInputDialog("Nhap so ngay muon:");
            if (input == null) return;

            int days = Integer.parseInt(input);
            GreaterFeeController control = new GreaterFeeController(dao);
            ArrayList<LibraryItemDTO> list = control.filter(days);

            if (list.isEmpty()) {
                UIExceptionHandler.showInfo("Không có tài liệu nào có phí > $2");
                return;
            }

            StringBuilder sb = new StringBuilder("💰 DANH SÁCH TÀI LIỆU CÓ PHÍ > $2\n\n");

            for (LibraryItemDTO dto : list) {
                sb.append("ID: ").append(dto.getId())
                  .append("\nTên: ").append(dto.getTitle())
                  .append("\nLoại: ").append(dto.getType())
                  .append("\n");

                if (dto.getType().equalsIgnoreCase("Book")) {
                    sb.append("Page: ").append(dto.getValue());
                } else if (dto.getType().equalsIgnoreCase("DVD")) {
                    sb.append("Duration: ").append(dto.getValue());
                } else if (dto.getType().equalsIgnoreCase("Magazine")) {
                    sb.append("Issue Number: ").append(dto.getValue());
                } else {
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
