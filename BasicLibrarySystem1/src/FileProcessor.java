/**
 * Created by chris on 1/20/2017.
 */

import java.io.*;
import java.util.ArrayList;
import org.json.simple.*;
import org.json.simple.parser.*;


public class FileProcessor {
    private ArrayList<InventoryItem> inventoryList  = new ArrayList<>();
    private InventoryItem libItem;
    private JSONArray data;
    private File originalFile= new File("c:/temp/test.txt");;
    private File updatedInventory = new File("c:/temp/newFile.txt");

    public ArrayList processData()throws FileNotFoundException, IOException, ParseException{

        //collection info from JSON file
        if(updatedInventory.exists()) {
            data = this.importFile(updatedInventory);
        }
        else{
            data = this.importFile(originalFile);
        }

        //loop through JSON array, creating 'Library Item" objects, adding them to an inventory list to be returned
        for(Object jArrayItem : data){
            JSONObject b = (JSONObject)jArrayItem;
            libItem = this.createItem(b);
            inventoryList.add(libItem);
        }
        return inventoryList;
    }

    //retrieve JSON data from a file and return a JSON array
    private JSONArray importFile(File f) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();
        FileReader file = new FileReader(f.getPath());
        JSONObject jsonObject = (JSONObject)parser.parse(file);
        JSONArray data = (JSONArray) jsonObject.get("library_items");
        return data;
    }

    //generate library items from JSON object info and return an InventoryItem
    private InventoryItem createItem(JSONObject jsonObject){
        if(jsonObject.get("item_type").equals("CD")){
            libItem = new CD((String)jsonObject.get("item_id"),(String)jsonObject.get("item_name"),(String)jsonObject.get("item_type"), (String)jsonObject.get("item_artist"));
        }
        else if(jsonObject.get("item_type").equals("DVD")){
            libItem = new CD((String)jsonObject.get("item_id"),(String)jsonObject.get("item_name"),(String)jsonObject.get("item_type"), (String)jsonObject.get("item_artist"));
        }
        else if(jsonObject.get("item_type").equals("Magazine")){
            libItem = new CD((String)jsonObject.get("item_id"),(String)jsonObject.get("item_name"),(String)jsonObject.get("item_type"), (String)jsonObject.get("item_artist"));
        }
        else if(jsonObject.get("item_type").equals("Book")){
            libItem = new CD((String)jsonObject.get("item_id"),(String)jsonObject.get("item_name"),(String)jsonObject.get("item_type"), (String)jsonObject.get("item_artist"));
        }
        return libItem;
    }
}
