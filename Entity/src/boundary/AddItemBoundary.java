package boundary;

import control.AddItemController;
import dto.LibraryItemDTO;
import javax.swing.JOptionPane;

public class AddItemBoundary {
    public static void show() {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.id = Long.parseLong(JOptionPane.showInputDialog("ID"));
        dto.title = JOptionPane.showInputDialog("Title");
        dto.type = JOptionPane.showInputDialog("Book / DVD / Magazine");
        dto.value = Integer.parseInt(JOptionPane.showInputDialog("Pages / Duration / Issue"));

        new AddItemController().addItem(dto);
    }
}
