package com.wordpress.jonyonandroidcraftsmanship.playingwithlists;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewDemoActivity2 extends Activity {

    private String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
    private ListView listView;
    private ArrayAdapter<String> stringArrayAdapter;
    private MyListItemClickListener myListItemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewdemo1);
        initialize();
    }

    private void initialize() {
        listView= (ListView) findViewById(R.id.lv);
        stringArrayAdapter=new ArrayAdapter<String>(this,R.layout.my_list_row2,R.id.tv,days);
        myListItemClickListener=new MyListItemClickListener();
        listView.setAdapter(stringArrayAdapter);
        listView.setOnItemClickListener(myListItemClickListener);
    }

    private class MyListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView tv= (TextView) view.findViewById(R.id.tv);
            Logger.toast(ListViewDemoActivity2.this,tv.getText().toString()+" "+ position);
        }
    }

}
