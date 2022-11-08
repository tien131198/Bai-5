/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:48 AM
    
    ProjectName: Bai5
*/public class Room {
    protected String category;
    protected int price;

    public Room(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
