
package main;

import boundary.*;
import dao.LibraryItemDAO;
import util.UIExceptionHandler;

public class MainMenu {
    private  LibraryItemDAO libraryItemDAO;

    public MainMenu(LibraryItemDAO libraryItemDAO) {
        this.libraryItemDAO = libraryItemDAO;
    }

    public void run() {
        while (true) {
            try {
                int choice = showMenu();

                switch (choice) {
                    case 1:
                        AddItemBoundary additem = new AddItemBoundary(libraryItemDAO);
                        additem.show();
                        break;

                    case 2:
                        RemoveItemBoundary removeitem = new RemoveItemBoundary(libraryItemDAO);
                        removeitem.show();
                        break;
                    case 3:
                        ViewDetaiBoundary viewitem = new ViewDetaiBoundary(libraryItemDAO);
                        viewitem.show();
                        break;
                    case 4:
                        SearchItemBoundary searchitem = new SearchItemBoundary(libraryItemDAO);
                        searchitem.show();
                        break;
                    case 5:
                        UpdateItemBoundary updateitem = new UpdateItemBoundary(libraryItemDAO);
                        updateitem.show();
                        break;
                    case 6:
                        CountItemBoundary countItem= new CountItemBoundary();
                        countItem.show();
                        break;
                    case 7:
                        ListAllBoundary lisi = new ListAllBoundary(libraryItemDAO);
                        lisi.show();
                        break;
                    case 8:
                        GreaterFeeBoundary gfb = new GreaterFeeBoundary(libraryItemDAO);
                        gfb.show();
                        break;
                    case 0:
                        UIExceptionHandler.showInfo("Cảm ơn bạn đã sử dụng chương trình!");
                        return;

                    default:
                        UIExceptionHandler.showWarning("Lựa chọn không hợp lệ! Vui lòng chọn từ 0-8");
                        break;
                }
            } catch (Exception e) {
                UIExceptionHandler.handleException(e);
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