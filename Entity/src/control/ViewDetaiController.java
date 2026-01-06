/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Haidang7320
 */
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
public class ViewDetaiController {
    public LibraryItemDTO viewDetail(long id)
    {
       LibraryItem item = LibraryItemDAO.findById(id);
       if (item == null) return null;
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.id = item.getId();
        dto.title = item.getTitle();
        dto.type = item.getType();
        dto.value = item.getValue();

        return dto;
    }
}