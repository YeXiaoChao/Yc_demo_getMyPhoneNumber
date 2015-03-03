package com.yanis.getmyphonenumber;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView listView;
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GetNumber.getNumber(this);

		initView();
	}

	private void initView() {
		listView =(ListView) findViewById(R.id.listView);
		adapter = new MyAdapter(GetNumber.lists, this);
		listView.setAdapter(adapter);
	}
}
