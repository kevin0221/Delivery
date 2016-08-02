package delivery.dev.com.delivery.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import delivery.dev.com.delivery.R;


public class HorizontalListAdapter extends BaseAdapter {

    private ArrayList<HashMap<String, String>> dataObjects = new ArrayList<HashMap<String, String>>();

    public HorizontalListAdapter(ArrayList<HashMap<String, String>> arrData)
    {
        dataObjects = arrData;
    }

    @Override
    public int getCount() {
        return dataObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View retval = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_included_workout_item, null);

        ImageView imgThumb = (ImageView) retval.findViewById(R.id.img_thumbnail);
        TextView txtTitle = (TextView)retval.findViewById(R.id.lbl_included_workout_title);
        TextView txtDistance = (TextView)retval.findViewById(R.id.lbl_included_workout_distance);
        TextView txtBurn = (TextView)retval.findViewById(R.id.lbl_included_workout_burn);
        TextView txtElevation = (TextView)retval.findViewById(R.id.lbl_included_workout_elevation);

        HashMap<String, String> data = dataObjects.get(position);

        String picName = data.get("image");
        int picId = parent.getContext().getResources().getIdentifier(picName, "drawable", parent.getContext().getPackageName());
        imgThumb.setImageResource(picId);

        txtTitle.setText(data.get("title"));
        txtDistance.setText(data.get("distance") + " mi");
        txtBurn.setText(data.get("burn") + " Cals");
        txtElevation.setText(data.get("elevation") + " ft");

        retval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return retval;
    }
}
