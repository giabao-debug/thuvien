package boundary;

import javax.swing.JOptionPane;
import util.UIExceptionHandler;

public class ResultBoundary {

    public void showResult(int book, int dvd, int magazine) {
        try {
            JOptionPane.showMessageDialog(null,
                "📚 Book: " + book +
                "\n🎬 DVD: " + dvd +
                "\n📰 Magazine: " + magazine);
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}
