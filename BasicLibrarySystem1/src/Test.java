import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by chris on 1/20/2017.
 */
public class Test {
    //instantiate inventory list
    private static ArrayList<InventoryItem> inventoryList  = new ArrayList<>();

    public static void main(String[] args)throws FileNotFoundException, IOException, ParseException {
        FileProcessor j = new FileProcessor();
        inventoryList = j.processData();

        for(int x = 0; x < inventoryList.size(); x++) {
            System.out.println(inventoryList.get(x).name);
            //inventoryList.g
        }
    }
}
