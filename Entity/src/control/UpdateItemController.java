/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
public class UpdateItemController {
    public boolean update(LibraryItemDTO dto) {
        LibraryItem item = LibraryItemDAO.findById(dto.id);
        if (item == null) return false;
        item.setTitle(dto.title);
        item.setValue(dto.value);
        return true;
    }
}
