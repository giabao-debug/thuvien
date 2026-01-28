package util;

import javax.swing.JOptionPane;
import exception.ItemNotFoundException;
import exception.ItemRemovalFailedException;


public class UIExceptionHandler {
    

    public static void handleException(Exception e) {
        if (e instanceof ItemNotFoundException) {
            JOptionPane.showMessageDialog(
                null, 
                "❌ Lỗi: Không tìm thấy tài liệu!\n\n" + e.getMessage(),
                "Thông báo lỗi",
                JOptionPane.ERROR_MESSAGE
            );
        } 
        else if (e instanceof ItemRemovalFailedException) {
            JOptionPane.showMessageDialog(
                null, 
                "❌ Lỗi: Không thể xóa tài liệu!\n\n" + e.getMessage(),
                "Thông báo lỗi",
                JOptionPane.ERROR_MESSAGE
            );
        }
        else if (e instanceof NumberFormatException) {
            JOptionPane.showMessageDialog(
                null, 
                "❌ Lỗi: Vui lòng nhập số hợp lệ!",
                "Thông báo lỗi",
                JOptionPane.ERROR_MESSAGE
            );
        }
        else if (e instanceof IllegalArgumentException) {
            JOptionPane.showMessageDialog(
                null, 
                "❌ Lỗi: Dữ liệu không hợp lệ!\n\n" + e.getMessage(),
                "Thông báo lỗi",
                JOptionPane.ERROR_MESSAGE
            );
        }
        else {
            JOptionPane.showMessageDialog(
                null, 
                "❌ Lỗi không xác định: " + e.getMessage(),
                "Thông báo lỗi",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    

    public static void showSuccess(String message) {
        JOptionPane.showMessageDialog(
            null, 
            "✓ " + message,
            "Thành công",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void showWarning(String message) {
        JOptionPane.showMessageDialog(
            null, 
            "⚠ " + message,
            "Cảnh báo",
            JOptionPane.WARNING_MESSAGE
        );
    }
    

    public static void showInfo(String message) {
        JOptionPane.showMessageDialog(
            null, 
            "ℹ " + message,
            "Thông tin",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}