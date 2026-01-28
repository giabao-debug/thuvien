/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import control.ViewDetaiController;
import dto.LibraryItemDTO;
import util.UIExceptionHandler;
import javax.swing.JOptionPane;
import dao.LibraryItemDAO;
/**
 *
 * @author Haidang7320
 */
public class ViewDetaiBoundary {
    private LibraryItemDAO dao;
    public ViewDetaiBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show()
    {
        try {
            long id = Long.parseLong(
                    JOptionPane.showInputDialog("Nhập ID")
            );
            LibraryItemDTO dto = new ViewDetaiController(dao).viewDetail(id);

            String info;

            switch (dto.getType().toLowerCase()) {
                case "book":
                    info = "Page: " + dto.getValue();
                    break;
                case "dvd":
                    info = "Duration: " + dto.getValue();
                    break;
                case "magazine":
                    info = "Issue Number: " + dto.getValue();
                    break;
                default:
                    info = "Value: " + dto.getValue();
            }

            JOptionPane.showMessageDialog(
                null,
                dto.getId() + " | " + dto.getTitle() + " | " + dto.getType() + " | " + info
            );
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}