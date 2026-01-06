/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;


import control.GreaterFeeController;
import dto.LibraryItemDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GreaterFeeBoundary {

    public static void show() {
        String input = JOptionPane.showInputDialog("Nhap so ngay muon:");
        if (input == null) return;

        int days;
        try {
            days = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "So ngay khong hop le");
            return;
        }

       /* GreaterFeeController control = new GreaterFeeController();
        ArrayList<LibraryItemDTO> list = control.filter(days);

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Khong co tai lieu nao co phi  > 2$");
            return;
        }

        StringBuilder sb = new StringBuilder("Danh sach tai lieu > 2$\n\n");

        for (LibraryItemDTO dto : list) {
            sb.append("ID: ").append(dto.id)
              .append("\nTen: ").append(dto.title)
              .append("\nLoai: ").append(dto.type)
              .append("\nGia tri: ").append(dto.value)
              .append("\n--------------------\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());*/
    }
}
