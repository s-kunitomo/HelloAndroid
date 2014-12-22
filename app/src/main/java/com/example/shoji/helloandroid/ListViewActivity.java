package com.example.shoji.helloandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // ①データを準備
        //String[] items = {"item 0", "item 1", "item 2"};

        // ArrayList
        List<String> items = new ArrayList<String>();
//        items.add("item 0");
//        items.add("item 1");
//        items.add("item 2");
//        items.add("item 3");
        for (int i = 0; i < 10; i++)
        {
            //items.add("item " + i);
        }

        // ②Adapterを準備
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, items);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        // ③ListViewにAdapterを設置
        final ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setEmptyView(findViewById(R.id.empty));
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener ()
        {
            @Override
            public void onItemClick (AdapterView<?> adapterView, View view, int i, long l)
            {
                //Toast.makeText(ListViewActivity.this, Integer.toString(i) + "番目の要素です。", Toast.LENGTH_SHORT).show();
                //String s = myListView.getItemAtPosition(i).toString();
                //Toast.makeText(ListViewActivity.this, s, Toast.LENGTH_SHORT).show();
                TextView tv = (TextView) view;
                tv.setText("Clicked");
            }
        });
    }
}
