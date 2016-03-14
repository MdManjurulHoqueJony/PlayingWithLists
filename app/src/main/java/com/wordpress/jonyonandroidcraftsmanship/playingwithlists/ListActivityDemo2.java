package com.wordpress.jonyonandroidcraftsmanship.playingwithlists;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivityDemo2 extends ListActivity {

    private String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
    private ListView listView;
    private ArrayAdapter<String> stringArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdemo2);
        initialize();
    }

    private void initialize() {
        listView= (ListView) findViewById(android.R.id.list);
        stringArrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        listView.setAdapter(stringArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        TextView tv= (TextView) view;
        Logger.toast(this,tv.getText().toString()+" "+ position);
    }
}
