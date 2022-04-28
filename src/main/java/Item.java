public class Item {
    private String name;
    private int qt;

    public int getQt() {
        return qt;
    }

    public String getDesc() {
        return desc;
    }

    private String desc;

    public Item(String name, int i, String desc){
        this.name = name;
        qt = i;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
}
