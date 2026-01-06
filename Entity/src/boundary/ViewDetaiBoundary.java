
package boundary;
import control.ViewDetaiController;
import dto.LibraryItemDTO;
import javax.swing.JOptionPane;

public class ViewDetaiBoundary {
    public static void show()
    {
        long id = Long.parseLong(
                JOptionPane.showInputDialog("Nhập ID")
        );

        LibraryItemDTO dto = new ViewDetaiController().viewDetail(id);

        if(dto == null)
        {
            JOptionPane.showMessageDialog(null, "Khong co du lieu");
            
        }
        else
        {
            JOptionPane.showMessageDialog(null ,dto.id + " | " + dto.title + " | " + dto.type );   // them switch sau de phan ra tung loai 
        }
    }
}
