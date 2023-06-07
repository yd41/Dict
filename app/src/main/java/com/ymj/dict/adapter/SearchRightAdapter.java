package com.ymj.dict.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ymj.dict.R;
import com.ymj.dict.bean.PinBuWordBean;

import java.util.List;


public class SearchRightAdapter extends BaseAdapter {
    Context context;
    List<PinBuWordBean.ResultBean.ListBean> mDatas;
    LayoutInflater inflater;
    public SearchRightAdapter(Context context, List<PinBuWordBean.ResultBean.ListBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_search_pgv,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        PinBuWordBean.ResultBean.ListBean bean = mDatas.get(position);
        String zi = bean.getZi();
        holder.tv.setText(zi);
        return convertView;
    }

    class ViewHolder{
        TextView tv;
        public ViewHolder(View view){
            tv = view.findViewById(R.id.item_sgv_tv);
        }
    }
}
