package main;

import dao.FileLibraryItemDAO;
import dao.LibraryItemDAO;
import db.fakedb;

public class Main {

    public static void main(String[] args) {
        fakedb.load();
        LibraryItemDAO db = fakedb.getDB();         // ✅

        LibraryItemDAO dao = new FileLibraryItemDAO();
        new MainMenu(dao).run();
    }
}