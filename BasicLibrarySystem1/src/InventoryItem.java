import java.util.Date;

public class InventoryItem {
    String id, name, type;
    Date checkoutDate;
    Date checkinDate;
    boolean checkedOut = false;
    boolean checkedIn = true;

    InventoryItem(){
        id = "";
        name = "";
        type = "";
        checkoutDate = null;
    }
    InventoryItem(String idNumber, String itemName, String itemType){
        id = idNumber;
        name = itemName;
        type = itemType;
    }
    public void checkOut(){
        checkedOut = true;
        checkoutDate = new Date();
    }
    public void getCheckoutDate(){
        System.out.println(checkoutDate);
    }
    public String getName(){
        return name;
    }
}
