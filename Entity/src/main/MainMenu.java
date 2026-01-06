
package main;
import boundary.*;

public class MainMenu {


    public MainMenu() {
    }

    public void run() {
        while (true) {
            int choice = showMenu();

            switch (choice) {
                case 1:
                    AddItemBoundary additem = new AddItemBoundary();
                    additem.show();
                    break;

                case 2:
                    RemoveItemBoundary removeitem = new RemoveItemBoundary();
                    removeitem.show();
                    break;
                case 3:
                    ViewDetaiBoundary viewitem = new ViewDetaiBoundary();
                    viewitem.show();
                    break;
                case 4:
                    SearchItemBoundary searchitem = new SearchItemBoundary();
                    searchitem.show();
                    break;
                case 5:
                    UpdateItemBoundary updateitem = new UpdateItemBoundary();
                    updateitem.show();
                    break;
                case 6:
                    CountItemBoundary countItem= new CountItemBoundary();
                    countItem.show();
                    break;
                case 7:
                    ListAllBoundary lisi = new ListAllBoundary();
                    lisi.show();
                    break;
                case 8:
                    GreaterFeeBoundary gfb = new GreaterFeeBoundary();
                    gfb.show();
                    break;
                case 0:
                    return;

                default:
                    break;
            }
        }
    }

    private int showMenu() {
        String menu =
              "===== QUAN LY THU VIEN =====\n"
            + "1. Them moi Tai lieu\n"
            + "2. Xoa Tai lieu\n"
            + "3. Xem Chi Tiet Tai Lieu\n"
            + "4. Tim kiem Tai lieu\n"
            + "5. Cap nhat tai lieu\n"
            + "6. Thong ke so luong\n"
            + "7. In danh sach Tai lieu\n"
            + "8. Danh sach phi muon > 2$\n"
            + "0. Thoat";

        String choice =
                javax.swing.JOptionPane.showInputDialog(menu);

        if (choice == null) return 0;
        return Integer.parseInt(choice);
    }
}