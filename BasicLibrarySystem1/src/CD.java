/**
 * Created by chris on 1/20/2017.
 */
public class CD extends InventoryItem {
    String artist = "";

    public CD (){
        super();
        artist = "";
    }

    public CD (String idNumber, String itemName, String itemType, String artistName){
        super(idNumber, itemName, itemType);
        artist = artistName;
    }
}
