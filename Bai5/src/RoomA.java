/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:48 AM
    
    ProjectName: Bai5
*/public class RoomA extends Room{
    public RoomA() {
        super("a", 500);

    }

    @Override
    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
