
package dto;

public class LibraryItemDTO {
    private long id;
    private String title;
    private String type;
    private int value;

    public LibraryItemDTO() {}
    public LibraryItemDTO(long id, String title, String type, int value) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.value = value;
    }

    public long getId() { return id; }
    public void setId(long _id) { id = _id; }

    public String getTitle() { return title; }
    public void setTitle(String _title) { title = _title; }

    public String getType() { return type; }
    public void setType(String _type) { type = _type; }

    public int getValue() { return value; }
    public void setValue(int _value) { value = _value; }
    public String formatDisplay() {
            String formattedValue = String.format("%,d VND", value); // Định dạng số: 10000 -> 10,000
            
            // Tùy biến hiển thị dựa trên type
            String categoryLabel = (type != null) ? type.toUpperCase() : "UNKNOWN";
            
            return String.format("[%s] #%d: %-20s | Giá: %s", 
                                categoryLabel, id, title, formattedValue);
        }
}