/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import javax.swing.JOptionPane;
import dto.LibraryItemDTO;
import control.SearchItemController;
import java.util.ArrayList;
/**
 *
 * @author Haidang7320
 */
public class SearchItemBoundary {
    public static void show()
    {
        String title = JOptionPane.showInputDialog("Nhap Tieu De Can Tim:");
       /* ArrayList<LibraryItemDTO> list = new SearchItemController().search(title);
        showlist(list);
    }
    private static void showlist(ArrayList<LibraryItemDTO> list)
    {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Khong co ket qua");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (LibraryItemDTO dto : list) {
            sb.append(dto.id)
              .append(" | ")
              .append(dto.title)
              .append(" | ")
              .append(dto.type)
              .append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());*/
    }
}