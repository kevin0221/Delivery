package delivery.dev.com.delivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import delivery.dev.com.delivery.adapters.HorizontalListAdapter;
import delivery.dev.com.delivery.cutomviews.HorizontalListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HorizontalListView listView = (HorizontalListView)findViewById(R.id.list_included_workout);


        ArrayList<HashMap<String, String>> arrData = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> itemData1 = new HashMap<String, String>();
        itemData1.put("image", "img_redwoods");
        itemData1.put("title", "Redwoods National Park");
        itemData1.put("distance", "3.8");
        itemData1.put("burn", "796");
        itemData1.put("elevation", "1358");
        arrData.add(itemData1);

        HashMap<String, String> itemData2 = new HashMap<String, String>();
        itemData2.put("image", "img_yellowstone");
        itemData2.put("title", "Yosemite National Park");
        itemData2.put("distance", "4.5");
        itemData2.put("burn", "568");
        itemData2.put("elevation", "1523");
        arrData.add(itemData2);

        HashMap<String, String> itemData3 = new HashMap<String, String>();
        itemData3.put("image", "img_yosemite");
        itemData3.put("title", "Yellowstone National Park");
        itemData3.put("distance", "2.7");
        itemData3.put("burn", "624");
        itemData3.put("elevation", "2586");
        arrData.add(itemData3);

        HorizontalListAdapter adapter = new HorizontalListAdapter(arrData);
        listView.setAdapter(adapter);
    }

}
