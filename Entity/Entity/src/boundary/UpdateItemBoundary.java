/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

import control.UpdateItemController;
import dto.LibraryItemDTO;
import dao.LibraryItemDAO;
import util.UIExceptionHandler;

import javax.swing.JOptionPane;
public class UpdateItemBoundary {
    private LibraryItemDAO dao;
    public UpdateItemBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show() {
        try {
            LibraryItemDTO dto = new LibraryItemDTO();
            dto.setId(Long.parseLong(JOptionPane.showInputDialog("Nhập ID cần sửa")));
            dto.setTitle(JOptionPane.showInputDialog("Nhập title mới"));
            dto.setValue(Integer.parseInt(JOptionPane.showInputDialog("Nhập gia tri mới: ")));
            UpdateItemController up = new UpdateItemController(dao);
            up.update(dto);
            UIExceptionHandler.showSuccess("Cập nhật tài liệu thành công!");
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}