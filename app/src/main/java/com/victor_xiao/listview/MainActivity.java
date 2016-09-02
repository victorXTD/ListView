package com.victor_xiao.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private final static String name="name";
    private final static String No="No";
    private final static String sex="sex";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names={"林磊","李华","孙莉莉","韩梅梅"};
        String[] Nos={"2014010774","2014010775","2014010776","2014010777"};
        String[] sexs={"男","男","女","女"};

        List<Map<String,Object>> items= new ArrayList<>();

        for(int i=0;i<names.length;i++) {
            Map<String,Object> item= new HashMap<>();
            item.put(name, names[i]);
            item.put(No, Nos[i]);
            item.put(sex, sexs[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{name,No,sex},new int[]{R.id.txtname,R.id.txtNo,R.id.txtsex});

        ListView list=(ListView)findViewById(R.id.listView);

        list.setAdapter(adapter);
    }
}
