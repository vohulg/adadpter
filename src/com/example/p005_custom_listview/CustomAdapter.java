package com.example.p005_custom_listview;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

//import com.example.p005_custom_listview.POJO;
//import com.example.p005_custom_listview.R;


public class CustomAdapter extends BaseAdapter implements OnClickListener 
{

	private Context context;
	private List<POJO> listPhonebook;
	
	public CustomAdapter (Context context, List<POJO> listPhonebook)
	{
		this.context = context;
		this.listPhonebook = listPhonebook;
		
	}
	
	
	@Override
	public int getCount() {
		return listPhonebook.size();
	}

	@Override
	public Object getItem(int position) {
		
		return listPhonebook.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		POJO phbook = listPhonebook.get(position);
		
		if(convertView == null)
		{			
			//getLayoutInflater();
			//LayoutInflater inflater1 = this.getLayoutInflater();
			
			LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.phone_row, null);
						
		}
		
		TextView tvName = (TextView)convertView.findViewById(R.id.tvName);
    	tvName.setText(phbook.getName());
    	
    	TextView tvEmail = (TextView)convertView.findViewById(R.id.tvEmail);
    	tvEmail.setText(phbook.getEmail());
    	
    	TextView tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
    	tvPhone.setText(phbook.getPhone());	
		
		return convertView;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
