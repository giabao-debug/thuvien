/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

/**
 *
 * @author Haidang7320
 */
import control.UpdateItemController;
import dto.LibraryItemDTO;

import javax.swing.JOptionPane;
public class UpdateItemBoundary {
    public static void show() {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.id = Long.parseLong(JOptionPane.showInputDialog("Nhập ID cần sửa"));
        dto.title = JOptionPane.showInputDialog("Nhập title mới");
        dto.value = Integer.parseInt(JOptionPane.showInputDialog("Nhập gia tri mới: "));

        boolean result = new UpdateItemController().update(dto);

        JOptionPane.showMessageDialog(null,
                result ? "Sửa thành công" : "Không tìm thấy tài liệu");
    }
}