package com.yanis.getmyphonenumber;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private List<PhoneInfo> lists;
	private Context context;//承接上下文
	
	public MyAdapter(List<PhoneInfo> lists,Context context)
	{
		this.lists = lists;
		this.context = context;
	}
	
	//返回集合的数量
	@Override
	public int getCount() {
		return lists.size();
	}

	//返回当前数据
	@Override
	public Object getItem(int position) {
		return lists.get(position);
	}

	//获取当前ID
	@Override
	public long getItemId(int position) {
		return position;
	}

	//返回当前视图 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder ;
		if(convertView==null)
		{
			convertView = LayoutInflater.from(context).inflate(R.layout.call,null);
			holder = new ViewHolder();
			holder.tvName =  (TextView)convertView.findViewById(R.id.tv_Name);
			holder.tvNumber =  (TextView)convertView.findViewById(R.id.tv_Number);
			convertView.setTag(holder);
		}else {
			holder = (ViewHolder)convertView.getTag();
		}
		holder.tvName.setText(lists.get(position).getPhoneName());
		holder.tvNumber.setText(lists.get(position).getPhoneNumber());
		return convertView;
	}
	
	private static class ViewHolder{
		TextView tvName;
		TextView tvNumber;
	}

}
