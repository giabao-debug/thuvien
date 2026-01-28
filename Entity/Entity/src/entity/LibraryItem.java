package entity;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable {
    protected long id;
    protected String title;
    protected String type;

    public LibraryItem(long id, String title, String type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public long getId() { return id; }
    public void setId(long _id) { id = _id; }
    
    public String getTitle() { return title; }
    public void setTitle(String _title) { title = _title; }
    
    public String getType() { return type; }
    public void setType(String _type) { type = _type; }

    public abstract double calculateFee(int days);
    public abstract void setValue(int _value);
    public abstract int getValue();
}