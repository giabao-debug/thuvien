/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import control.RemoveItemController;
import javax.swing.JOptionPane;
import dto.LibraryItemDTO;

/**
 *
 * @author Haidang7320
 */
public class RemoveItemBoundary {
    public static void show() {
        long id = Long.parseLong(JOptionPane.showInputDialog("Nhap ID can xoa: "));
        boolean result  = new RemoveItemController().removeItem(id);
        if(result)
        {
            JOptionPane.showMessageDialog(null,"Da Xoa");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Chua Xoa");

        }
    }
}