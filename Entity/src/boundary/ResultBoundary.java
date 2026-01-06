package boundary;

import javax.swing.JOptionPane;

public class ResultBoundary {

    public void showResult(int book, int dvd, int magazine) {
        JOptionPane.showMessageDialog(
            null,
            "Book: " + book +
            "\nDVD: " + dvd +
            "\nMagazine: " + magazine
        );
    }
}

